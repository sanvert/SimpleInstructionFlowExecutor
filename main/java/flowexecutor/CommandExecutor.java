package flowexecutor;

import flowexecutor.command.IntegerPushCommand;
import flowexecutor.exception.FlowStackEmptyException;
import flowexecutor.exception.FlowStackFullException;
import flowexecutor.model.FlowStack;

/**
 * Created by 212455787 on 1/17/2017.
 */
public class CommandExecutor {
    public CommandExecutor() {
    }

    public void execute(FlowStack stack, String command) throws FlowStackFullException, FlowStackEmptyException {
        if(command.contains("push")) {
            String[] commandSegments = command.split(" ");
            if(commandSegments.length>1) {
                new IntegerPushCommand().execute(stack, new Object[] {Integer.parseInt(commandSegments[1])});
            }
        }
    }
}
