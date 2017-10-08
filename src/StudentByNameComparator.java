import java.util.Comparator;

public class StudentByNameComparator  implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return (student1.getName() + student1.getSurname()).compareTo(student2.getName() + student2.getSurname());
    }
}
