public class InsertInBST {
    static class Node{
        int value;
        Node left;
        Node right;

        public Node(int val){
            this.value = val;
            this.next = null;
        }
    }

    public static void main(String [] args){

    }
    public static Node insert(Node currentNode, int value){
        if(currentNode == null){
            return new Node(value);
        }else if(value > currentNode.value){
            insert(currentNode.right, value);
        }else if (value < currentNode.value){
            insert(currentNode.left, value);
        }else{
            return currentNode;
        }
    }
}
