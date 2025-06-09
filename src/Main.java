import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        StudentHashMap map = new StudentHashMap();
        StudentBST bst = new StudentBST();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Student\n2. Display All\n3. Search by ID\n4. Delete by ID\n5. Sort by GPA\n6. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = sc.nextDouble();

                    Student s = new Student(id, name, gpa);
                    list.add(s);
                    map.add(s);
                    bst.insert(s);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    String searchId = sc.nextLine();
                    Student found = map.get(searchId);
                    System.out.println(found != null ? found : "Not Found");
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = sc.nextLine();
                    if (map.contains(deleteId)) {
                        map.delete(deleteId);
                        list.delete(deleteId);
                        System.out.println("Deleted from records.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    bst.inorder();
                    break;
            }
        } while (choice != 6);
        sc.close();
    }
}
