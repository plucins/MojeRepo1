package lab10;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public final class StudentSteamUtils {

    private StudentSteamUtils() {
    }

    public static List<Student> findActiveStudents(List<Student> students) {
        return students.stream()
                .filter(Student::isActive)
                .toList();
    }

    public static List<Student> findStudentsWithAvgAbove(List<Student> students, double minAvg) {
        return students.stream()
                .filter(s -> s.getAverageGrade() > minAvg)
                .toList();
    }

    public static List<String> getStudentEmail(List<Student> students) {
        return students.stream()
                .map(Student::getEmail)
                .toList();
    }

    public static List<Student> sortByAvgDesc(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getAverageGrade))
                .toList();
    }

    public static double calculateGroupAvg(List<Student> students) {
        return students.stream()
                .mapToDouble(Student::getAverageGrade)
                .average()
                .orElse(0.0);
    }

    public static Optional<Student> findBestStudent(List<Student> students) {
        return students.stream()
                .min(Comparator.comparingDouble(Student::getAverageGrade));
    }

    public static Map<Integer, List<Student>> groupStudentsByYear(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getYear));
    }

    public static Set<String> getUniqueTechnologies(List<Student> students) {
        return students.stream()
                .flatMap(s -> s.getTechnologies().stream())
                .collect(Collectors.toSet());
    }

    public static List<Student> findStudentsByTechnology(List<Student> students, String technology) {
        return students.stream()
                .filter(s -> s.getTechnologies().contains(technology))
                .toList();
    }

    public static Map<String, Long> countStudentsByTechnology(List<Student> students) {
        return students.stream()
                .flatMap(s -> s.getTechnologies().stream())
                .collect(Collectors.groupingBy(
                        s -> s,
                        Collectors.counting()
                ));
    }

    public static Optional<Student> findFirstInactiveStudent(List<Student> students) {
        return students.stream()
                .filter(s -> !s.isActive())
                .findFirst();
    }

}
