package lab7;

public class CourseAlreadyStartedException extends RuntimeException {

    public CourseAlreadyStartedException(String message) {
        super(message);
    }
}
