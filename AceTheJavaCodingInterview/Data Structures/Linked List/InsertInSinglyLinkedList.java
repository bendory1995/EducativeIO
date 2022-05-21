public class InsertInSinglyLinkedList{
    public Node head;
    public int size;

    public class Node{
        int data;
        Node next;
        public Node(){
            this.data = -1;
            this.next = null;
        }
    
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public void insertAtHead(int data){
        Node nodeToAdd = new Node();
        nodeToAdd.data = data;

        nodeToAdd.next = head;
        head = nodeToAdd;
        size++;

    }

    public static void main(String [] args){

    }

}