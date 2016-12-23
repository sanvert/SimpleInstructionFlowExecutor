package flowexecutor;

import org.junit.Before;
import org.junit.Test;

import flowexecutor.model.FlowStack;

import static org.junit.Assert.assertEquals;

/**
 * Created by 212455787 on 12/23/2016.
 */
public class FlowStackOperationsTest {
    FlowStack<Integer> flowStack;

    @Before
    public void setUp() {
        flowStack = new FlowStack<Integer>();
    }

    @Test
    public void shouldPushIntoFlowStack() {
        Integer element = new Integer(1999);
        flowStack.push(element);
        assertEquals(element, flowStack.pop());
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void shouldRaiseExceptionWhenStackIsFull() {
        Integer element = new Integer(1999);
        flowStack.push(element);
        assertEquals(element, flowStack.pop());
    }
}
