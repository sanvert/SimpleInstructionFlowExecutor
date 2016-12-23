package flowexecutor.model;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

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

    public T pop() {
        return stack.pop();
    }

    public void push(T element) {
        stack.push(element);
    }

    public int getCurrentStackSize() {
        return this.stack.size();
    }
}
