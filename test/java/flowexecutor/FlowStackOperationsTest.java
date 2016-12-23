package flowexecutor;

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

    @Before
    public void setUp() {

        flowStack = new FlowStack<Integer>();
        limitedStack = new FlowStack<Integer>(1);
    }

    @Test
    public void shouldPushIntoFlowStack() throws FlowStackFullException {
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
}
