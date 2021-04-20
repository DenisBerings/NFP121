package question2;


import java.util.Observable;

public class Number extends Observable {
    // On déclare une variable "value" (entier)
    private int value;
    // On génère les Getters & Setters pour cette variable
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        setChanged();
        notifyObservers();
    }
}
