import java.util.HashSet;

/**
 * intersection_point_ll
 */
public class intersection_point_ll {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        HashSet h = new HashSet<>();
        while(headA!=null)
        {
            h.add(headA);
            headA = headA.next;
        }
        
        while(headB!=null)
        {
            if(h.contains(headB))
            {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    public static void main(String[] args) {
       
    }
}