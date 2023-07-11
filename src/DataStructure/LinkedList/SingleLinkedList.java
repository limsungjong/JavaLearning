package DataStructure.LinkedList;

import java.util.Objects;

public class SingleLinkedList {
    Node header = null;

    public SingleLinkedList() {
        this.header = new Node(null);
    }

    class Node {
        Object data = null;
        Node next = null;

        Node(Object data) {
            this.data = data;
        }
    }

    public boolean append(Object data) {
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

    public Object delete(Object data) {
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

    public void printNode() {
        Node n = header.next;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print(n.data);
    }
    /*
    싱글 링크 리스트에서
     */
    public void removeDups() {
        Node n = header;
        while (n.next != null) {
            Node r = n;
            while (r.next != null) {
                if (n.data == r.next.data) {
                    r.next = r.next.next;
                }
            }
        }
    }
}
