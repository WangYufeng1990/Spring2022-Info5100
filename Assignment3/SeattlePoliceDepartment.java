package Assignment3;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    ArrayList<Person> personList;
    String notification;

    public SeattlePoliceDepartment(ArrayList<Person> personList, String notification) {
        this.personList = personList;
        this.notification = notification;
    }

    public void NotifyCitizens(String s) {
        for (Person person : personList) {
            System.out.println("SeattlePoliceDepartment notifies " + person.getName() + " " + s + ".");
        }
    }
}
