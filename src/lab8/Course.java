package lab8;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private String name;
    private Set<Student> students;

    public Course(String name) {
        this.name = name;
        this.students =  new HashSet<>();
    }

    public void registerStudent(Student student) {
        boolean added = students.add(student);

        if(!added) {
            System.out.println("lab10.Student " + student.getName() + " already exists");
        }
    }

    public void printStudents(){
        System.out.println("Course: " + name);
        for(Student student : students){
            System.out.println(student);
        }
    }
}
