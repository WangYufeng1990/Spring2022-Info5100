package MidTerm;


import java.util.HashMap;

import java.util.Map;


public class Main {

    public static void main(String[] args) {
        //Question1
        Student student1 = new Student("Mike", 123, 3.6);
        Student p1 = student1;
        Student p2 = new Student(student1.name, student1.studentID, student1.gpa);

        //Question3
        Moody happy = new Happy();
        Moody sad = new Sad();
        Psychiatrist psychiatrist = new Psychiatrist();
        psychiatrist.examine(happy);
        happy.expressFeelings();
        psychiatrist.observe(happy);
        psychiatrist.examine(sad);
        sad.expressFeelings();
        psychiatrist.observe(sad);

        Main t = new Main();

        System.out.println(t.longestSubstring("pwwkew"));

    }

    /*Question1
    like I typed in the main function, p1 is a shallow copy of student1, and p2 is a deep copy of student1;
    shallow copy is just the copy of the reference of student1, when we change student1, p1 will be also changed.
    deep copy is a new instance of student1, when we change student1, the p2 will not be changed.
    */

    /*Question2

    Interface is a blueprint that can be used to implement a class.
    Interface does not contain any specific methods.
    Methods in interface are abstract methods.
    Interface cannot be instantiated.

    Abstract class has the abstract keyword in declaration.
    Abstract classes have abstract methods.
    We should override and implement the method in class which extends the abstract class.
    Abstract classes cannot be instantiated.
    */

    //Question6

    public int longestSubstring(String s){
        if (s.length() < 2) return s.length();
        int start = 0, end = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()){
            if (!map.containsKey(s.charAt(end))){
                map.put(s.charAt(end), end);
                end++;
            }
            else {
                start = map.get(s.charAt(end))+1;
                map.put(s.charAt(end), end);
                end++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}
