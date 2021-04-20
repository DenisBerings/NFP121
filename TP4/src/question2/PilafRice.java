package question2;

public class PilafRice implements Cook {
    private Cooking cooking;

    PilafRice(RiceType riceType) {
        cooking = new Cooking(riceType);
    }

    @Override
    public Cooking cookRice() {
        return cooking;
    }
}
