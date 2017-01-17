package flowexecutor;

import flowexecutor.model.FlowStack;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by 212455787 on 1/6/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class CommandExecutorTest {
    FlowStack<Integer> flowStack;
    CommandExecutor executor;

    @Before
    public void setUp() {
        flowStack=mock(FlowStack.class);
        executor = new CommandExecutor();
    }

    @Test
    public void shouldExecutePushCommand() throws Exception {
        executor.execute(flowStack, "push 1");
        verify(flowStack).push(Mockito.any());
    }
}
