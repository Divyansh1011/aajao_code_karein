public class reverse_linked_list {

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
          ListNode prv = head;
          
          ListNode current = head.next;
          
          while(current!=null)
          {
              ListNode nextNode = current.next;
              current.next = prv;
              prv = current;
              current =   nextNode;
          
              
          }
          
          head.next = null;
          head = prv;
          
          return head;
          
          
      }
    public static void main(String[] args) {
        
    }
}
