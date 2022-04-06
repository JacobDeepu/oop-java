import java.util.Scanner;

public class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    void insert(int x) {
        Node newNode = new Node(x);
        newNode.next = null;
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        Node ptr = head;
        while (ptr.next != null)
            ptr = ptr.next;
        ptr.next = newNode;
        newNode.prev = ptr;
    }

    void delete(int x) {
        Node ptr = head;
        while (ptr != null) {
            if (ptr.data == x)
                break;
            ptr = ptr.next;
        }
        if (ptr == null) {
            System.out.println("Element not found !!");
            return;
        }
        if (ptr.prev != null)
            ptr.prev.next = ptr.next;
        else
            ptr.next.prev = null;
        if (ptr.next != null)
            ptr.next.prev = ptr.prev;
        else
            ptr.prev.next = null;
        System.out.println("Element deleted !!");
    }

    public void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        int choice, x, flag = 1;
        System.out.println("1. Insert into List");
        System.out.println("2. Delete element from List");
        System.out.println("3. Dispaly List");
        System.out.println("4. Exit");
        while (flag == 1) {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to be inserted: ");
                    x = input.nextInt();
                    dll.insert(x);
                    break;
                case 2:
                    System.out.print("Enter the element to be deleted: ");
                    x = input.nextInt();
                    dll.delete(x);
                    break;
                case 3:
                    System.out.println("List: ");
                    dll.display();
                    break;
                case 4:
                    System.out.println("Bye!!");
                    flag = 0;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
        input.close();
    }
}