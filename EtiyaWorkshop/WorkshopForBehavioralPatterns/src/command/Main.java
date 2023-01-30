package command;

import command.commands.ICommand;
import command.commands.StartProductCommand;
import command.commands.StopProductCommand;
import command.models.Product;
import command.queues.CommandQueue;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.productName = "Uçlu Kalem";

        StartProductCommand startProductCommand = new StartProductCommand(product);
        startProductCommand.execute();

        StopProductCommand stopProductCommand = new StopProductCommand(product);
        stopProductCommand.execute();

        CommandQueue commandQueue = new CommandQueue();
        commandQueue.addCommand(startProductCommand);
        commandQueue.addCommand(stopProductCommand);

        commandQueue.executeAll();

    }
}
