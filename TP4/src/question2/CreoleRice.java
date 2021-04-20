package question2;

public class CreoleRice implements Cook {
    private Cooking cooking;

    CreoleRice(RiceType riceType) {
       cooking = new Cooking(riceType);
    }

    @Override
    public Cooking cookRice() {
        return cooking;
    }
}
