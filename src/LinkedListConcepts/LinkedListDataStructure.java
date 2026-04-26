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

    void addAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
    }

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }

    void deleteAtHead(){
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
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
    }
}
