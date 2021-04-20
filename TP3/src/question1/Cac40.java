package question1;

public class Cac40 extends Observable {
    // On déclare une variable value
    private int value;
    // On génère les Getter & Setter pour la variable value
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        super.notifyObs();
    }
}
