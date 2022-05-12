public class ReverseLinkedList {
    public static void main(String [] args){

    }

    static class Node {
        int value;
        Node next;
    }
    public static void reverse(Node head){
        if(head == null) return;
        else{
            reverse(head.next);
            System.out.println(head.value + " ");
        }
    }
}
