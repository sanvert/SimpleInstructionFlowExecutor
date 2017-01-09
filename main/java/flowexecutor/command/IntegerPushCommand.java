package flowexecutor.command;

import flowexecutor.exception.FlowStackEmptyException;
import flowexecutor.exception.FlowStackFullException;
import flowexecutor.model.FlowStack;

/**
 * Created by 212455787 on 1/6/2017.
 */
public class IntegerPushCommand implements Command {
    @Override
    public void execute(FlowStack flowStack, Object[] parameters) throws FlowStackEmptyException, FlowStackFullException {
        flowStack.push(parameters[0]);
    }
}