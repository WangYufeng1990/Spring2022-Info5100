package Assignment2.Question1;

public class Student {
    public int rollNumber;
    public String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(Student s) {
        this.rollNumber = s.rollNumber;
        this.name = s.name;
    }

    public String printRoll() {
        return this.rollNumber + "";
    }

    public String printName() {
        return this.name + "";
    }
}
