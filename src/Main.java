import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(
                Arrays.asList(new Student("Pavel", "Pavlov", 16, 8.5),
                        new Student("Ivan", "Ivanov", 18, 8.0),
                        new Student("Sergey", "Sergeev", 18, 8.7),
                        new Student("Ivan", "Petrov", 17, 9.1)));
        list.forEach(System.out::println);
        System.out.println();

        list.sort(new StudentByNameComparator());
        list.forEach(System.out::println);
        System.out.println();

        list.sort(new StudentByAgeComparator());
        list.forEach(System.out::println);
        System.out.println();

        list.sort(new StudentByAverageScoreComparator());
        list.forEach(System.out::println);
        System.out.println();

        bestStudent(list);
    }

    public static void bestStudent(Collection<Student> students){
        Student bestStudent = students.iterator().next();
        for (Student student : students){
            if (bestStudent.getAverageScore() < student.getAverageScore()){
                bestStudent = student;
            }
        }
        System.out.println("Best student: " + bestStudent.getName() + " " + bestStudent.getSurname());
    }
}
