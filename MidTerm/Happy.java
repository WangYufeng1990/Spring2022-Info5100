package MidTerm;

public class Happy extends Moody {
    @Override
    String getMood() {
        return "Happy";
    }

    @Override
    void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString(){
        return "Subject laughs a lot";
    }
}
