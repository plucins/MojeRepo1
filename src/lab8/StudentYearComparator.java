package lab8;

import java.util.Comparator;

public class StudentYearComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = Integer.compare(o1.getYear(), o2.getYear());
        if(result != 0) return result;

        return o1.getName().compareTo(o2.getName());
    }
}
