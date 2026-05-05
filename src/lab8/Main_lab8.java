package lab8;


public class Main_lab8 {
    public static void main(String[] args) {

        University university = new University();
        Student s1 = new Student(1, "Jan", 1);
        Student s2 = new Student(2, "Wlodek", 5);
        Student s3 = new Student(3, "Adam", 3);

        Course course = new Course("Programowanie 1");
        course.registerStudent(s1);
        course.registerStudent(s2);

        university.addStudent(s1);
        university.addStudent(s2);
        university.addStudent(s3);
        System.out.println(university.groupStudentsByYear());

        System.out.println(university.getStudentsSorted(new StudentNameComparator()));
        System.out.println(university.getStudentsSorted(new StudentYearComparator()));

    }
}
