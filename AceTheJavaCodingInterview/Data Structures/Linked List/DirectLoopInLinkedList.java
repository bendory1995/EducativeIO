public class DirectLoopInLinkedList {
    public static void main(String []args){
        
    }

    public static class ListNode{
        int val;
        ListNode next;
    }

    public static boolean hasDirectLoop(ListNode head){
        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
