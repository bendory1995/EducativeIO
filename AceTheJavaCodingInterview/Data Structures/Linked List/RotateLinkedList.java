public class RotateLinkedList {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;
        if (head.next == null)
            return head;
        if (k == 0)
            return head;

        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (k % count == 0)
            return head;
        int dist = count - (k % count);

        ListNode firstDiv = head;
        ListNode secondDiv = head;
        ListNode prev = null;

        for (int i = 0; i < dist; i++) {
            prev = secondDiv;
            secondDiv = secondDiv.next;
        }
        prev.next = null;
        temp = secondDiv;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = firstDiv;

        return secondDiv;
    }
}
