public class StudentLinkedList {
    class Node {
        Student student;
        Node next;

        Node(Student student) {
            this.student = student;
        }
    }

    private Node head;

    public void add(Student s) {
        Node newNode = new Node(s);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = newNode;
        }
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.student);
            curr = curr.next;
        }
    }

    public boolean delete(String id) {
        if (head == null) return false;
        if (head.student.id.equals(id)) {
            head = head.next;
            return true;
        }
        Node curr = head;
        while (curr.next != null && !curr.next.student.id.equals(id)) {
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }
}
