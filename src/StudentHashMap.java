import java.util.HashMap;

public class StudentHashMap {
    HashMap<String, Student> map = new HashMap<>();

    public void add(Student s) {
        map.put(s.id, s);
    }

    public Student get(String id) {
        return map.get(id);
    }

    public void delete(String id) {
        map.remove(id);
    }

    public boolean contains(String id) {
        return map.containsKey(id);
    }
}
