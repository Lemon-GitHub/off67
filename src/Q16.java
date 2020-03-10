/*
 * 合并两个有序链表
 * */

public class Q16 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode newHead = null;
        ListNode newTail = null;

        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                if(newHead == null) {
                    newHead = cur1;
                    newTail = cur1;
                } else {
                    newTail.next = cur1;
                    newTail = newTail.next;
                }
                cur1 = cur1.next;

            } else {
                if(newHead == null) {
                    newHead = cur2;
                    newTail = cur2;
                } else {
                    newTail.next = cur2;
                    newTail = newTail.next;
                }
                cur2 = cur2.next;
            }
        }

        if (cur1 != null) {
            newTail.next = cur1;
        } else {
            newTail.next = cur2;
        }

        return newHead;
    }
}
