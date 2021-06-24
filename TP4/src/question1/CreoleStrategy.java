package question1;
// On implémente l'interface Strategy sur la classe CreoleStrategy pour que cette dernière hérite de sa méthode cookRice()
public class CreoleStrategy implements Strategy {
    // On surcharge la méthode cookRice héritée de l'interface Strategy... 
    @Override
    public RiceCookingWays cookRice() {
        System.out.println("In a small saucepan, melt butter.");
        System.out.println("add Creole seasoning and pepper");
        System.out.println("Cook over medium heat for 3 minutes.");
        System.out.println("Stir in rice.");
        System.out.println("Cover and heat through.");
        // ...et on lui fait retourner l'enum RiceCookingWays.CREOLE
        return RiceCookingWays.CREOLE;
    }

}
