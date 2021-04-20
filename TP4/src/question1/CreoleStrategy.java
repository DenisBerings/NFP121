package question1;
// On implémente l'interface Strategy sur la classe CreoleStrategy
public class CreoleStrategy implements Strategy {
    // On ajoute un type de retour "RiceCookingWays et on retourne le bon type de "RiceCookingWays"
    @Override
    public RiceCookingWays cookRice() {
        System.out.println("In a small saucepan, melt butter.");
        System.out.println("add Creole seasoning and pepper");
        System.out.println("Cook over medium heat for 3 minutes.");
        System.out.println("Stir in rice.");
        System.out.println("Cover and heat through.");
        return RiceCookingWays.CREOLE;
    }

}
