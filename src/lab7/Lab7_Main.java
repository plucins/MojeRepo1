package lab7;

import java.time.LocalDate;

public class Lab7_Main {
    public static void main(String[] args) {
        Course c = new Course("Java basic", 9, LocalDate.of(2026, 1, 1));

        try {
            c.registerStudent(new Student("Janek"));

        } catch (RuntimeException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

    }
}
