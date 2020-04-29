public class P92_Reverse_Linked_List_II{
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode chead = head;
        ListNode cur = head;
        while (cur.next != null) {
            ListNode node = cur.next;
            cur.next = node.next;
            node.next = chead;

            chead = node;
        }
        
        return chead;
    }
}

class ListNode { 
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}