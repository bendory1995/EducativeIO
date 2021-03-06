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

    public void inertAtEnd(int data){
        Node nodeToAdd = new Node();
        nodeToAdd.data = data;
        nodeToAdd.next = null;

        if(head == null){
            head = nodeToAdd;
        }

        Node temp = head;

        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = nodeToAdd;
        size++;
    }
    public boolean searchInSinglyLinkedList(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void deleteByValue(int data){
        if(head == null) return;
        Node curr = head;
        Node prev = null;

        if(curr.data == data){
            head = curr.next;
            return;
        }

        while(curr != null){
            if(curr.data == data){
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public static void main(String [] args){

    }

}