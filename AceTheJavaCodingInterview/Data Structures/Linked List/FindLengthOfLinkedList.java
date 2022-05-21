public class FindLengthOfLinkedList {
    public static void main(String [] args){

    }
    Node head;

    public class Node{
        int data;
        Node next;

        public Node(){

        }
    }

    public int findLength(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
        }
        return count;
    }
}
