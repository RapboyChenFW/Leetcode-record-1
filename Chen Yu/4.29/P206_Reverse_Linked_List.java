public class P206_Reverse_Linked_List {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return null;

        ListNode pre = new ListNode(0);
        pre.next = head;

        int cnt = 0;
        while (cnt++ < m - 1 && pre.next != null) pre = pre.next;

        ListNode phead = pre.next;
        ListNode cur = phead;
        int reverseNum = n - m;
        for (int i = 0; i < reverseNum; i++) {
            ListNode node = cur.next;
            cur.next = node.next;
            node.next = phead;
            
            phead = node;
        }

        pre.next = phead;

        return m == 1 ? phead : head;
    }
}


class ListNode { 
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
