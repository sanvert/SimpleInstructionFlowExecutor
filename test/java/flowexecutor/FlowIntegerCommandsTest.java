package flowexecutor;

import flowexecutor.command.IntegerAddCommand;
import flowexecutor.command.IntegerSubtractCommand;
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

    private void refreshStack(FlowStack<Integer> stack) throws FlowStackEmptyException {
        if(stack != null) {
            while (stack.getCurrentStackSize() > 0) {
                stack.pop();
            }
        }
    }

    @Test
    public void shouldContainResultOfAddition() throws FlowStackFullException, FlowStackEmptyException {
        refreshStack(stack);
        stack.push(1);
        stack.push(2);
        new IntegerAddCommand().execute(stack);
        assertEquals(3, (int)stack.pop());
    }

    @Test
    public void shouldContainResultOfSubtraction() throws FlowStackFullException, FlowStackEmptyException {
        refreshStack(stack);
        stack.push(1);
        stack.push(3);
        new IntegerSubtractCommand().execute(stack);
        assertEquals(2, (int)stack.pop());
    }
}
