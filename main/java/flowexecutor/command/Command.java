package flowexecutor.command;

import flowexecutor.exception.FlowStackEmptyException;
import flowexecutor.exception.FlowStackFullException;
import flowexecutor.model.FlowStack;

/**
 * Created by 212455787 on 12/27/2016.
 */
public interface Command<T> {
    public void execute(FlowStack<T> flowStack) throws Exception;
}
