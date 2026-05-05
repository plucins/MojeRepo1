package lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    private List<Student> allStudents;
    private Map<Integer, Student> studentById;
    private List<Course> courses;

    public University() {
        this.allStudents = new ArrayList<>();
        this.studentById = new HashMap<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.allStudents.add(student);
        this.studentById.put(student.getId(), student);
    }

    public Student findStudentById(int id) {
        return this.studentById.get(id);
    }

    public Map<Integer, List<Student>> groupStudentsByYear() {
        Map<Integer, List<Student>> results = new HashMap<>();

        for (Student student : allStudents) {
            results.putIfAbsent(student.getYear(), new ArrayList<>());
            results.get(student.getYear()).add(student);
        }

        return results;
    }

    public List<Student> getStudentsSorted(Comparator<Student> comparator) {
        List<Student> copy = new ArrayList<>(allStudents);
        copy.sort(comparator);
        return copy;
    }
}
