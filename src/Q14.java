/*
 * 链表中倒数第K个节点
 * */

public class Q14 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        int length = size(head);
        //位置合法
        if(k < 0 || k > length){
            return null;
        }
        //空链表
        if(head == null){
            return null;
        }

        int offset = length - k;
        ListNode cur = head;
        for(int i = 0; i < offset; i++){
            cur = cur.next;
        }
        return cur;
    }

    public int size(ListNode head){
        int size = 0;
        for(ListNode cur = head; cur != null; cur = cur.next){
            size++;
        }
        return size;
    }
}
