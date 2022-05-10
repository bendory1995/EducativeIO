public class SearchInLinkedList {
    static class Node{
        int value;
        Node next;
    }
    public static void main(String [] args){
    }

    public static boolean search(Node head, int num){
        if(head == null) return false;
        else if(head.value == num){
            return true;
        }else{
            return search(head.next, num);
        }
    }
    
}

