package flowexecutor.command;

import flowexecutor.exception.FlowStackEmptyException;
import flowexecutor.exception.FlowStackFullException;
import flowexecutor.model.FlowStack;

/**
 * Created by 212455787 on 1/6/2017.
 */
public class IntegerDivideCommand implements Command {
    @Override
    public void execute(FlowStack flowStack, Object[] parameters) throws FlowStackEmptyException, FlowStackFullException {
        int second = (int)flowStack.pop();
        int first = (int)flowStack.pop();
        flowStack.push(first/second);
    }
}
