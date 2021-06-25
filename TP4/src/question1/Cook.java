package question1;

// On implémente l'interface Strategy sur la classe Cook pour que cette dernière hérite de sa méthode cookRice()
public class Cook implements Strategy {
    // On déclare une variable de type Strategy
    private Strategy strategy ;
    
    // On génère le Setter de la variable strategy précédemment déclarée
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    /* On surcharge la méthode cookRice héritée de l'interface Strategy pour lui faire  
       retourner un appel à la méthode cookRice() sur l'objet strategy instancié */
    @Override
    public RiceCookingWays cookRice() {
        return strategy.cookRice();
    }
}
