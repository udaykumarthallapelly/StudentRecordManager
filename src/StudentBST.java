public class StudentBST {
    class Node {
        Student student;
        Node left, right;

        Node(Student student) {
            this.student = student;
        }
    }

    private Node root;

    public void insert(Student student) {
        root = insertRec(root, student);
    }

    private Node insertRec(Node root, Student student) {
        if (root == null) return new Node(student);
        if (student.gpa < root.student.gpa)
            root.left = insertRec(root.left, student);
        else
            root.right = insertRec(root.right, student);
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.student);
            inorderRec(root.right);
        }
    }
}
