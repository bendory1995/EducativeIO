public class FindMiddleNodeInLinkedList {
    public static void main(String [] args){

    }
    public static class ListNode{
        ListNode next;
        int val;
        public ListNode(){

        }
    }

    public static ListNode middleValue(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            if(fast == null || fast.next == null){
                break;
            }else{
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow;
    }
}
