package Quiz1;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Ashish", 40, 123456);
        p.giveQuiz("Quiz1");
        Student s = new Student("mike", 20,12222);
        s.takeQuiz("Quiz1");
    }
}
