package question1;
// On implémente l'interface Observer sur la classe Broker
public class Broker implements Observer{
    // On déclare la variable changeDetected (booléen)
    private boolean changeDetected;
    // On génère le getter de la variable changeDetected
    public boolean isChangeDetected() {
        return changeDetected;
    }
    // On surcharge la méthode update héritée de l'interface Observer
    @Override
    public void update() {
        this.changeDetected = true;
    }
}
