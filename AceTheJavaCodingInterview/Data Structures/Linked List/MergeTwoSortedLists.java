public class MergeTwoSortedLists {
    public static void main(String [] args){
        
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(-1);
        ListNode temp = dummyHead;
        
        while(list1 != null && list2 != null){
            ListNode nodeToAdd;
            if(list1.val < list2.val){
                nodeToAdd = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                nodeToAdd = new ListNode(list2.val);
                list2 = list2.next;
            }
            temp.next = nodeToAdd;
            temp = temp.next;
        }
        
        while(list1 != null){
            ListNode nodeToAdd = new ListNode(list1.val);
            list1 = list1.next;
            temp.next = nodeToAdd;
            temp = temp.next;
        }
        while(list2 != null){
            ListNode nodeToAdd = new ListNode(list2.val);
            list2 = list2.next;
            temp.next = nodeToAdd;
            temp = temp.next;
        }
        return dummyHead.next;
    }


}
