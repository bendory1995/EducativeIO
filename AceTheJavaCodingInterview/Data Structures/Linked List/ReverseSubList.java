public class ReverseSubList {
    public static void main(String [] args){
        
    }

    public static ListNode reverseBetween(ListNode head, int m, int n){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr1 = dummy;
        ListNode prev1 = null;

        for(int i = 0; i < m; i++){
            prev1 = curr1;
            curr1 = curr1.next;
        }

        ListNode curr2 = curr1;
        ListNode prev2 = prev1;
        ListNode node2;
        for(int i = m; i <= n; i++){
            node2 = curr2.next;
            curr2.next = prev2;
            prev2 = curr2;
            curr2 = node2;
        }
        prev1.next = prev2;
        curr1.next = curr2;
        return dummy.next;
    }
}
