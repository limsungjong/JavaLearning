package DataStructure;

import java.util.Objects;

public class SingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList x = new SingleLinkedList();
        x.append(1);
        x.append(2);
        x.append(3);
        x.append(4);
        x.append(5);
        x.printNode();
        x.delete(5);
        x.delete(4);
        x.delete(1);
        System.out.println();
        x.printNode();
    }
    Node header = null;

    SingleLinkedList() {
        this.header = new Node(null);
    }

    class Node {
        Object data = null;
        Node next = null;

        Node(Object data) {
            this.data = data;
        }
    }

    boolean append(Object data) {
        Node n = header;
        Node end = new Node(data);
        boolean isComplete = false;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
        if (Objects.nonNull(n.next.data)) {
            isComplete = true;
        }
        return isComplete;
    }

    Object delete(Object data) {
        Object deleteData = null;
        Node n = header;

        while (n.next != null) {
            if (Objects.equals(n.next.data, data)) {
                deleteData = n.data;
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }

        return deleteData;
    }

    void printNode() {
        Node n = header.next;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print(n.data);
    }
}
