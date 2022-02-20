package Quiz1;

public class Professor extends Person{

    public Professor(String name, int age, int ID) {
        super(name, age, ID);
    }

    public void giveQuiz(String s) {
        System.out.println("Professor gives quiz " + s + " to student!");
    }
}