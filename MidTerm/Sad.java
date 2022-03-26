package MidTerm;

public class Sad extends Moody {
    @Override
    String getMood() {
        return "Sad";
    }

    @Override
    void expressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    }

    public String toString(){
        return "Subject cries a lot";
    }
}
