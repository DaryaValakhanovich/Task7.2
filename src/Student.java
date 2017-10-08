public class Student{
    private String name;
    private String surname;
    private int age;
    private double averageScore;

    public Student(String name, String surname, int age, double averageScore){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString(){
        return name + " " +surname + " " + age + " " + averageScore;
    }
}
