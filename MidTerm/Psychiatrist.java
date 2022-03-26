package MidTerm;

public class Psychiatrist {
    public void examine(Moody moody){
        System.out.println("How are you felling today?");
    };
    public void observe(Moody moody){
        System.out.println("Observation:" + moody.toString());
    };
    public String toString() {
        return "Subject laughs a lot";
    };
}
