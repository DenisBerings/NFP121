package question1;
// On implémente l'interface Strategy sur la classe PilafStrategy
public class PilafStrategy implements Strategy {
    // On surcharge la méthode cookRice héritée de l'interface Strategy...
    @Override
    public RiceCookingWays cookRice() {
        System.out.println("Heat oil in a skillet.");
        System.out.println("Add onions and other aromatics, like garlic.");
        System.out.println("Add rice.");
        System.out.println("Add liquid.");
        System.out.println("Cover and let cook.");
        // ...et on lui fait retourner l'enum RiceCookingWays.PILAF
        return RiceCookingWays.PILAF;
    }
}
