public class ReverseLinkedList {
    public class Node{
        int data;
        Node next;
        public Node(){

        }
    }

    public static void main(String [] args){

    }

    public static Node reverseList(Node head){
        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
