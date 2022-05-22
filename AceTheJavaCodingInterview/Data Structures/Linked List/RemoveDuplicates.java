import java.util.*;
public class RemoveDuplicates {
    public static class Node{
        int val;
        Node next;
        public Node(){
            
        }
    }

    public static void main(String [] args){

    }

    public static Node removeDuplicates(Node head){

        Node temp = head;
        Set<Integer> treeset = new TreeSet<Integer>();

        while(temp != null){
            if(!treeset.contains(temp.val)){
                treeset.add(temp.val);
            }else{
                temp = temp.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
