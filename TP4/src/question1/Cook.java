package question1;

// On implémente l'interface Strategy sur la classe Cook
public class Cook implements Strategy {
    // On déclare une variable de type Strategy
    private Strategy strategy ;
    // On surcharge la méthode cookRice héritée de l'interface Strategy
    @Override
    public RiceCookingWays cookRice() {
        return strategy.cookRice();
    }
    // On génère le Setter de la variable strategy précédemment déclarée
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
