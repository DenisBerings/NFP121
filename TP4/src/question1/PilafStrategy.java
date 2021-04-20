package question1;
// On implémente l'interface Strategy sur la classe PilafStrategy
public class PilafStrategy implements Strategy {
    // On ajoute un type de retour "RiceCookingWays et on retourne le bon type de "RiceCookingWays"
    @Override
    public RiceCookingWays cookRice() {
        System.out.println("Heat oil in a skillet.");
        System.out.println("Add onions and other aromatics, like garlic.");
        System.out.println("Add rice.");
        System.out.println("Add liquid.");
        System.out.println("Cover and let cook.");
        return RiceCookingWays.PILAF;
    }
}
