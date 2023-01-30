package command.commands;

import command.models.Product;

public class StopProductCommand implements ICommand {

    private Product  product;

    public StopProductCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        this.product.productionStopped();
        System.out.println("Üretim durduruldu");
    }
}
