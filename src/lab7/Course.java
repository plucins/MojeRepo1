package lab7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int maxParticipants;
    private LocalDate startDate;
    private List<Student> participants;

    public Course(String name, int maxParticipants, LocalDate startDate) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if(maxParticipants <= 0){
            throw new IllegalArgumentException("Max participants cannot be negative or zero");
        }

        if(startDate == null){
            throw new IllegalArgumentException("Start date cannot be null");
        }

        this.name = name;
        this.maxParticipants = maxParticipants;
        this.startDate = startDate;
        this.participants = new ArrayList<>();
    }

    public void registerStudent(Student student) throws NoSeatsAvailableException {
        if(student == null){
            throw new IllegalArgumentException("Student cannot be null");
        }

        if(LocalDate.now().isAfter(startDate)){
            throw new CourseAlreadyStartedException("Cannot register student. Course " + name + " has already started");
        }

        if(participants.size() >= maxParticipants){
            throw new NoSeatsAvailableException("No seals left in course " + name);
        }

        participants.add(student);
    }



}
