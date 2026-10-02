import java.util.LinkedList;

public class dummylink {
    private static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private final Node dummy;

    public dummylink(){
        dummy = new Node(-1);
        dummy.next = dummy;
    }

    public void add(int value){
        Node newNode = new Node(value);
        Node current = dummy;

        while (current.next != dummy){
            current = current.next;
        }

        current.next = newNode;
        newNode.next = dummy;
    }

    public void show(){
        Node current = dummy.next;

        while (current != dummy){
            System.out.println(current.data + " " + "\n");
            current = current.next;
        }
    }
    public void showReverse(){
        showReverse(dummy.next);
    }
    private void showReverse(Node current) {
        if (current == dummy) {
            return;
        }

        showReverse(current.next);
        System.out.print(current.data + " " + "\n");
    }
    public boolean find(int item) {
        Node current = dummy.next;

        while (current != dummy) {
            if (current.data == item) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Remove the first occurrence of an item
    public boolean remove(int item) {
        Node previous = dummy;
        Node current = dummy.next;

        while (current != dummy) {
            if (current.data == item) {
                previous.next = current.next;
                return true;
            }

            previous = current;
            current = current.next;
        }

        return false;
    }
}
