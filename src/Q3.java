/*
 * 从尾到头打印链表
 * */

import java.util.Stack;
import java.util.ArrayList;

public class Q3 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(ListNode cur = listNode; cur != null; cur = cur.next) {
            stack.push(cur.val);
        }
        while(!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }
}
