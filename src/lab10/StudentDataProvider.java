package lab10;

import java.util.List;

public class StudentDataProvider {

    public static List<Student> prepareStudents() {

        return List.of(

                new Student(
                        1L,
                        "Anna",
                        "Kowalska",
                        "anna.kowalska@uczelnia.pl",
                        1,
                        "Java Backend",
                        true,
                        4.8,
                        95,
                        List.of("Java", "Spring", "SQL", "Docker")
                ),

                new Student(
                        2L,
                        "Jan",
                        "Nowak",
                        "jan.nowak@uczelnia.pl",
                        2,
                        "Frontend",
                        true,
                        3.9,
                        78,
                        List.of("JavaScript", "React", "HTML", "CSS")
                ),

                new Student(
                        3L,
                        "Maria",
                        "Wiśniewska",
                        "maria.wisniewska@uczelnia.pl",
                        3,
                        "Data Science",
                        true,
                        4.9,
                        99,
                        List.of("Python", "Pandas", "SQL", "Machine Learning")
                ),

                new Student(
                        4L,
                        "Piotr",
                        "Zieliński",
                        "piotr.zielinski@uczelnia.pl",
                        2,
                        "Java Backend",
                        false,
                        2.7,
                        40,
                        List.of("Java", "Hibernate", "SQL")
                ),

                new Student(
                        5L,
                        "Karolina",
                        "Wójcik",
                        "karolina.wojcik@uczelnia.pl",
                        1,
                        "DevOps",
                        true,
                        4.3,
                        85,
                        List.of("Linux", "Docker", "Kubernetes", "Python")
                ),

                new Student(
                        6L,
                        "Tomasz",
                        "Lewandowski",
                        "tomasz.lewandowski@uczelnia.pl",
                        4,
                        "Cybersecurity",
                        true,
                        4.1,
                        88,
                        List.of("Linux", "Networking", "Python", "Security")
                ),

                new Student(
                        7L,
                        "Aleksandra",
                        "Kamińska",
                        "aleksandra.kaminska@uczelnia.pl",
                        3,
                        "Mobile Apps",
                        true,
                        4.5,
                        91,
                        List.of("Kotlin", "Android", "Firebase")
                ),

                new Student(
                        8L,
                        "Michał",
                        "Dąbrowski",
                        "michal.dabrowski@uczelnia.pl",
                        2,
                        "Frontend",
                        false,
                        3.1,
                        60,
                        List.of("JavaScript", "Vue", "CSS")
                ),

                new Student(
                        9L,
                        "Natalia",
                        "Szymańska",
                        "natalia.szymanska@uczelnia.pl",
                        5,
                        "Artificial Intelligence",
                        true,
                        5.0,
                        100,
                        List.of("Python", "TensorFlow", "Deep Learning", "SQL")
                ),

                new Student(
                        10L,
                        "Krzysztof",
                        "Mazur",
                        "krzysztof.mazur@uczelnia.pl",
                        4,
                        "Cloud Computing",
                        true,
                        3.7,
                        73,
                        List.of("AWS", "Docker", "Terraform", "Java")
                )
        );
    }
}
