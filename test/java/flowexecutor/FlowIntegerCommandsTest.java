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

    @Test
    public void shouldContainResultOfAddition() throws FlowStackFullException, FlowStackEmptyException {
        stack.push(1);
        stack.push(2);
        IntegerAddCommand addCommand = new IntegerAddCommand();
        addCommand.execute(stack);
        assertEquals(3, (int)stack.pop());
    }
}
