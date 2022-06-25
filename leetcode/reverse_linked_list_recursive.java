 class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

public class reverse_linked_list_recursive {
    public ListNode reverse(ListNode head)
    {
        if(head.next == null || head == null)
        {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }
    public static void main(String[] args) {
        
    }
}
