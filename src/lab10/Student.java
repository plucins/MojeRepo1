package lab10;

import java.util.List;

public class Student {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final int year;
    private final String specialization;
    private final boolean active;
    private final double averageGrade;
    private final int projectPoints;
    private final List<String> technologies;

    public Student(
            Long id,
            String firstName,
            String lastName,
            String email,
            int year,
            String specialization,
            boolean active,
            double averageGrade,
            int projectPoints,
            List<String> technologies
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.year = year;
        this.specialization = specialization;
        this.active = active;
        this.averageGrade = averageGrade;
        this.projectPoints = projectPoints;
        this.technologies = technologies;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getYear() {
        return year;
    }

    public String getSpecialization() {
        return specialization;
    }

    public boolean isActive() {
        return active;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public int getProjectPoints() {
        return projectPoints;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return getFullName()
                + " | rok: " + year
                + " | specjalizacja: " + specialization
                + " | średnia: " + averageGrade
                + " | technologie: " + technologies;
    }
}
