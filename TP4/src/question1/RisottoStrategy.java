package question1;
// On implémente l'interface Strategy sur la classe RisottoStrategy pour que cette dernière hérite de sa méthode cookRice() 
public class RisottoStrategy implements Strategy{
    // On surcharge la méthode cookRice héritée de l'interface Strategy... 
    public RiceCookingWays cookRice() {
        System.out.println("Use Cold Stock. Adding chilly stock to a hot pan will cool everything down and mess up the cooking process.");
        System.out.println("Stir It Constantly (or Not at All)");
        System.out.println("Add Too Much Stock.");
        System.out.println("Cook the Rice Till It's Mushy.");
        // et on lui fait retourner l'enum RiceCookingWays.RISOTTO
        return RiceCookingWays.RISOTTO;
    }
}
