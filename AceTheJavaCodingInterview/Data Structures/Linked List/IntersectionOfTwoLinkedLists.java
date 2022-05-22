public class IntersectionOfTwoLinkedLists {
    public static void main(String [] args){

    }

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        
        int count1= 0;
        int count2= 0;
        
        while(temp1 != null){
            count1++;
            temp1 = temp1.next;
        }
        
        while(temp2 != null){
            count2++;
            temp2 = temp2.next;
        }
        
        int dist = Math.abs(count1 - count2);
        if(count1 > count2){
            for(int i = 0; i < dist; i++){
                headA = headA.next;
            }
        }else{
            for(int i = 0; i < dist; i++){
                headB = headB.next;
            }
        }
        while(headA != null || headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
