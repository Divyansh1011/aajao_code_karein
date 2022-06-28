
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class detect_cycle_in_linked_list 
{
    public ListNode detectCycle(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;   
        ListNode entry = head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast)
            {
                while(slow!=entry)
                {
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null ;
        
    }
    public static void main(String[] args) {
        
    }
}
