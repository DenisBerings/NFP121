package question2;


import java.util.Observable;
// On implémente l'interface java Observable afin que la classe Number hérite de ses méthodes
public class Number extends Observable {
    // On déclare une variable "value" (entier)
    private int value;
    // On génère le Getter...
    public int getValue() {
        return value;
    }
    // ...& Setter pour la variable value...
    public void setValue(int value) {
        this.value = value;
        // ...Et on appelle les méthodes setChanged() & notifyObservers() de la classe mère (Observable)
        setChanged();
        notifyObservers();
    }
}
