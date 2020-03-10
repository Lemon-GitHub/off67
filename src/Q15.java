/*
 * 反转链表
 * */

public class Q15 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode newHead = null;
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                newHead = cur;
            }

            // 翻转
            cur.next = prev;

            // 更新
            prev = cur;
            cur = next;
        }

        return newHead;
    }
}