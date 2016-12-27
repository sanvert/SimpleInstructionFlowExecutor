package flowexecutor;

import flowexecutor.command.IntegerAddCommand;
import flowexecutor.exception.FlowStackEmptyException;
import flowexecutor.exception.FlowStackFullException;
import flowexecutor.model.FlowStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 212455787 on 12/27/2016.
 */
public class FlowIntegerCommandsTest {

    FlowStack<Integer> stack;

    @Before
    public void setUp() {
        stack = new FlowStack<Integer>();
    }

    private void refreshStack() throws FlowStackEmptyException {
        if(stack != null)
            while(stack.getCurrentStackSize() > 0)
                stack.pop();
    }

    @Test
    public void shouldContainResultOfAddition() throws FlowStackFullException, FlowStackEmptyException {
        refreshStack();
        stack.push(1);
        stack.push(2);
        IntegerAddCommand addCommand = new IntegerAddCommand();
        addCommand.execute(stack);
        assertEquals(3, (int)stack.pop());
    }
}
