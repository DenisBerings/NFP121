package question1;
// On implémente l'interface Strategy sur la classe SteamStrategy
public class SteamStrategy implements Strategy{
    // On ajoute un type de retour "RiceCookingWays et on retourne le bon type de "RiceCookingWays"
    @Override
    public RiceCookingWays cookRice() {
        System.out.println("Bring water to a boil in a medium saucepan. Stir in white rice and salt. Return to a boil over medium-high heat.");
        System.out.println("Reduce heat, and simmer, covered, until rice is tender and has absorbed all the water, 16 to 18 minutes (check only toward the end of cooking time). The rice will be studded with steam holes when ready.");
        System.out.println("Remove from heat, and let stand, covered, for 10 minutes. Fluff with a fork before serving.");
        return RiceCookingWays.STEAM;
    }
}
