public class Student {
    String id;
    String name;
    double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String toString() {
        return id + " | " + name + " | " + gpa;
    }
}
