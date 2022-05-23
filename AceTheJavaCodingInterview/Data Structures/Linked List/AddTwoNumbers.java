public class AddTwoNumbers{
    public static void main(String [] args){

    }
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }

        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(l1 != null || l2 != null){
            int val1 = (l1 == null ? 0 : l1.val);
            int val2 = (l2 == null ? 0 : l2.val);

            int sum = val1 + val2 + carry;
            int num = sum %10;

            ListNode node = new ListNode(num);
            temp.next = node;
            temp = temp.next;
            if(sum >= 10){
                carry = sum / 10;
            }else{
                carry = 0;
            }

            if(l1 != null)l1 = l1.next;
            if(l2 != null)l2 = l2.next;
        }

        if(carry > 0){
            ListNode node = new ListNode(carry);
            temp.next = node;
        }
        return dummy.next;

    }
}