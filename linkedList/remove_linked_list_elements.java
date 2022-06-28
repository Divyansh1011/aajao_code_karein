public class remove_linked_list_elements {
    public ListNode removeElements(ListNode head, int val) 
    {
       ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy ;
        ListNode current = head;
        while(current!=null)
        {
            if(current.val == val)
            {
                prev.next = current.next;
                
            }
            else
            {
                prev = current;
                
            }
            current = current.next;
        }
        return dummy.next;
        
    }
    public static void main(String[] args) {
        
    }
}
