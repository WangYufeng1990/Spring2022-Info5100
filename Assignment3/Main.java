package Assignment3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SeattlePoliceDepartment spd = new SeattlePoliceDepartment(new ArrayList<>(), "SPD Notification");
        Person p1 = new Person("Mike", 20);
        Person p2 = new Person("Tina", 19);
        Person p3 = new Person("John", 21);
        Person p4 = new Person("Will", 20);

        p1.subscribe(spd);
        p2.subscribe(spd);
        p3.subscribe(spd);
        spd.NotifyCitizens("Notification");
        p1.unsubscribe(spd);
        p2.unsubscribe(spd);
        spd.NotifyCitizens("Test");
    }
}
