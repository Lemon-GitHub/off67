/*
 * 栈的压入、弹出序列
 * */

import java.util.ArrayList;
import java.util.Stack;

public class Q21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();

        int indexPop = 0;
        for(int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);

            while(!stack.isEmpty() && stack.peek() == popA[indexPop]) {
                stack.pop();
                indexPop++;
            }
        }

        return stack.isEmpty();
    }
}