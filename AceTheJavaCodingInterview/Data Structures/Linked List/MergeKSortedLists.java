public class MergeKSortedLists {
    public static void main(String [] args){

    }

    public static ListNode mergeLists(ListNode[] lists){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode node : lists){
            while(node!= null){
                minHeap.add(node.val);
                node = node.next;
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(!minHeap.isEmpty()){
            temp.next = new ListNode(minHeap.remove());
            temp = temp.next;
        }

        return dummy.next;
    }
}
