package flowexecutor.model;

import flowexecutor.exception.FlowStackEmptyException;
import flowexecutor.exception.FlowStackFullException;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by 212455787 on 12/23/2016.
 */
public class FlowStack<T> {
    private int maxStackSize;
    private ConcurrentLinkedDeque<T> stack;

    public FlowStack() {
        stack = new ConcurrentLinkedDeque<T>();
        this.maxStackSize = Integer.MAX_VALUE;
    }

    public FlowStack(int maxStackSize) {
        stack = new ConcurrentLinkedDeque<T>();
        this.maxStackSize = maxStackSize;
    }

    public T pop() throws FlowStackEmptyException {
        if(this.stack.size()==0)
            throw new FlowStackEmptyException();
        return stack.pop();
    }

    public void push(T element) throws FlowStackFullException {
        if(this.stack.size()==maxStackSize)
            throw new FlowStackFullException();

        stack.push(element);
    }

    public int getCurrentStackSize() {
        return this.stack.size();
    }
}
