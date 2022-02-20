package Quiz1;

public class Student extends Person{
    public Student(String name, int age, int ID) {
        super(name, age, ID);
    }

    public void takeQuiz(String s) {
        System.out.println("Student takes quiz " + s + ".");
    }
}
