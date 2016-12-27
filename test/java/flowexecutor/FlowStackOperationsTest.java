package flowexecutor;

import flowexecutor.exception.FlowStackEmptyException;
import flowexecutor.exception.FlowStackFullException;
import flowexecutor.model.FlowStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 212455787 on 12/23/2016.
 */
public class FlowStackOperationsTest {
    FlowStack<Integer> flowStack;
    FlowStack<Integer> limitedStack;
    FlowStack<Integer> emptyStack;
    @Before
    public void setUp() {
        flowStack = new FlowStack<Integer>();
        limitedStack = new FlowStack<Integer>(1);
        emptyStack = new FlowStack<Integer>();
    }

    @Test
    public void shouldPushIntoFlowStack() throws FlowStackFullException, FlowStackEmptyException {
        Integer element = new Integer(1999);
        flowStack.push(element);
        assertEquals(element, flowStack.pop());
    }

    @Test(expected=FlowStackFullException.class)
    public void shouldRaiseExceptionWhenStackIsFull() throws FlowStackFullException {
        Integer element = new Integer(1999);
        limitedStack.push(element);
        limitedStack.push(element);
    }

    @Test(expected=FlowStackEmptyException.class)
    public void shouldRaiseExceptionWhenStackIsEmpty() throws FlowStackEmptyException {
        emptyStack.pop();
    }
}
