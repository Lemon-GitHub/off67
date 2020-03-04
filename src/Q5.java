/*
 * 两个栈实现队列
 * */

import java.util.Stack;

public class Q5 {
    Stack<Integer> stack1 = new Stack<Integer>(); //入栈
    Stack<Integer> stack2 = new Stack<Integer>(); //出栈

    public void push(int node) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

}
