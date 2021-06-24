package question1;
//On étend la classe abstraite Observable à la classe Cac40 afin que cette dernière hérite de ses méthodes
public class Cac40 extends Observable {
    // On déclare un entier value
    private int value;
    // On génère le Getter...
    public int getValue() {
        return value;
    }
    // ...& Setter pour la variable value...
    public void setValue(int value) {
        this.value = value;
        // ...Et on appelle la méthode notifyObs() de la classe mère (Observable)
        super.notifyObs();
    }
}
