package lab8;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int year;

    public Student(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id  == student.id && name.equals(student.name);
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " - " + name + " - " + year;
    }

}
