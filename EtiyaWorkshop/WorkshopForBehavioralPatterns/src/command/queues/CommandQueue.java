package command.queues;

import command.commands.ICommand;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {
    private List<ICommand> commandList = new ArrayList<>();

    public void addCommand(ICommand iCommand){
        commandList.add(iCommand);
    }

    public void executeAll(){
        for (ICommand iCommand:commandList) {
            iCommand.execute();
        }
        commandList.clear();

    }
}
