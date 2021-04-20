package question2;

public class SteamRice implements Cook {
    private Cooking cooking;

    SteamRice(RiceType riceType) {
        cooking = new Cooking(riceType);
    }

    @Override
    public Cooking cookRice() {
        return cooking;
    }
}
