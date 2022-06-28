public class palindrone_ll {
    public ListNode reverselist(ListNode slow)
    {
        ListNode pre = null;
        ListNode next = null;
        
        while(slow!=null)
        {
            next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }
        return pre;
        
    }
    public boolean isPalindrome(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;
        
        if(head == null || head.next == null)
        {
            return true;
        }
        
        //finding the middle element
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        slow.next = reverselist(slow.next);
        slow = slow.next;
        
        while(slow!=null)
        {
            if(head.val!=slow.val)
            {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;

        
        
    }
    public static void main(String[] args) {
        
    }
}
