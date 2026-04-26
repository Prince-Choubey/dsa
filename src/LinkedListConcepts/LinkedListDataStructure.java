package LinkedListConcepts;

class Node { // user defined data type
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Linkedlist { // user defined data structure
    Node head;
    Node tail;
    int size;

    int search(int val) {
        if (head == null) return -1;
        Node temp = head;
        int idx = 0;
        while (temp.next != null) {
            if (temp.val == val) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void addAtIndex(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index");
            return;
        }
        if (idx == 0) addAtHead(val);
        else if (idx == size) addAtTail(val);
        else {
            Node newNode = new Node(val);
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

    }

    void addAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void addAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
        size--;
    }

    void deleteAtIndex(int idx){
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0) {
            deleteAtHead();
            return;
        };
        Node temp = head;
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx==size-1) tail = temp;
        size--;
    }

    int get(int idx) {
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void display() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(10);
        ll.addAtTail(10);
        ll.addAtTail(10);
        ll.addAtTail(10);
        ll.addAtTail(10);
        ll.addAtHead(55);
        ll.display();
        ll.deleteAtHead();
        ll.display();
        ll.addAtIndex(4, 99);
        ll.display();
    }
}
