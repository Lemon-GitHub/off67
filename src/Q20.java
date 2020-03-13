/*
 * 包含min函数的栈 最小栈
 * */

import java.util.Stack;

public class Q20 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();


    public void push(int node) {
        if (stack.isEmpty()) {
            stack.push(node);
            minstack.push(node);
            return;
        }

        stack.push(node);

        int topVal = minstack.peek();
        if (node > topVal) {
            minstack.push(topVal);
        } else {
            minstack.push(node);
        }
    }

    public void pop() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minstack.peek();
    }
}
