package flowexecutor;

import flowexecutor.command.*;
import flowexecutor.exception.FlowStackEmptyException;
import flowexecutor.exception.FlowStackFullException;
import flowexecutor.model.FlowStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 212455787 on 12/27/2016.
 */
//@RunWith(MockitoJUnitRunner.class)
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
        new IntegerAddCommand().execute(stack, null);
        assertEquals(3, (int)stack.pop());
    }

    @Test
    public void shouldContainResultOfSubtraction() throws FlowStackFullException, FlowStackEmptyException {
        stack.push(3);
        stack.push(1);
        new IntegerSubtractCommand().execute(stack, null);
        assertEquals(2, (int)stack.pop());
    }

    @Test
    public void shouldContainResultOfMultiplication() throws FlowStackFullException, FlowStackEmptyException {
        stack.push(3);
        stack.push(2);
        new IntegerMultiplyCommand().execute(stack, null);
        assertEquals(6, (int)stack.pop());
    }

    @Test
    public void shouldContainResultOfDivision() throws FlowStackFullException, FlowStackEmptyException {
        stack.push(4);
        stack.push(2);
        new IntegerDivideCommand().execute(stack, null);
        assertEquals(2, (int)stack.pop());
    }

    @Test
    public void shouldContainResultOfPush() throws FlowStackFullException, FlowStackEmptyException {
        new IntegerPushCommand().execute(stack, new Integer[]{1});
        assertEquals(1, (int)stack.pop());
    }

}
