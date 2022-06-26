 class ListNode {
     int val;
     ListNode next;
        ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class remove_nth_node_from_ll {

    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head == null && head.next == null)
        {
            return head;
        }
            ListNode start = new ListNode();
            start.next = head;
            ListNode fast = start;
            ListNode slow = start;
        
            for(int i = 0;i<n;i++)
            {
                fast = fast.next;
            }
        
        while(fast.next !=null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
        
        
    }
    public static void main(String[] args) 
    {
        
        
    }
}
