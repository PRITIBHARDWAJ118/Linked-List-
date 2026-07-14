class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class dll {

    Node head = null;
    Node tail = null;
    int size = 0;

    // Add at Head
    void addAtHead(int val) {
        Node newNode = new Node(val);

        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Add at Tail
    void addAtTail(int val) {
        Node newNode = new Node(val);

        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Insert at any position
    void insertAnywhere(int val, int pos) {

        if (pos < 0 || pos > size) {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 0) {
            addAtHead(val);
            return;
        }

        if (pos == size) {
            addAtTail(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;

        size++;
    }

    // Delete Head
    void deleteAtHead() {

        if (size == 0) {
            System.out.println("List is Empty");
            return;
        }

        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
    }

    // Delete Tail
    void deleteAtTail() {

        if (size == 0) {
            System.out.println("List is Empty");
            return;
        }

        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }

    // Delete at any position
    void deleteAnywhere(int pos) {

        if (pos < 0 || pos >= size) {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 0) {
            deleteAtHead();
            return;
        }

        if (pos == size - 1) {
            deleteAtTail();
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
    }

    // Display Forward
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Display Reverse
    void displayReverse() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        dll list = new dll();

        list.addAtHead(10);
        list.addAtHead(20);
        list.insertAnywhere(30, 1);
        list.addAtTail(40);

        System.out.print("Forward : ");
        list.display();

        System.out.print("Reverse : ");
        list.displayReverse();

        list.deleteAtHead();
        list.display();

        list.deleteAtTail();
        list.display();

        list.deleteAnywhere(1);
        list.display();

        System.out.println("Size = " + list.size);
    }
}