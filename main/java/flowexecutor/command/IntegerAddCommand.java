package flowexecutor.command;

import flowexecutor.exception.FlowStackEmptyException;
import flowexecutor.exception.FlowStackFullException;
import flowexecutor.model.FlowStack;

/**
 * Created by 212455787 on 12/27/2016.
 */
public class IntegerAddCommand implements Command {
    @Override
    public void execute(FlowStack flowStack) throws FlowStackEmptyException, FlowStackFullException {
        flowStack.push((int)flowStack.pop() + (int)flowStack.pop());
    }
}
