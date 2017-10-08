import java.util.Comparator;

public class StudentByAverageScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student1.getAverageScore(), student2.getAverageScore());
    }
}
