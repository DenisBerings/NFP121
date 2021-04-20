package question2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    private Cook getRiceObject(RiceType rice) {
        if(rice.equals(RiceType.JAPONICA)) {
            return new SteamRice(RiceType.JAPONICA);
        } else if(rice.equals(RiceType.BASMATI)) {
            return new PilafRice(RiceType.BASMATI);
        } else {
            return new CreoleRice(RiceType.CAMARGUE);
        }
    }

    @Test
    public void testJaponica() {
        Cook cook;
        Cooking cooking;
        RiceType rice = RiceType.JAPONICA;
        cook = getRiceObject(rice);
        cooking = cook.cookRice();
        assertEquals("I am done cooking JAPONICA", cooking.prepareDinner());
    }

    @Test
    public void testBasmati() {
        Cook cook;
        Cooking cooking;
        RiceType rice = RiceType.BASMATI;
        cook = getRiceObject(rice);
        cooking = cook.cookRice();
        assertEquals("I am done cooking BASMATI", cooking.prepareDinner());
    }

    @Test
    public void testCamargue() {
        Cook cook;
        Cooking cooking;
        RiceType rice = RiceType.CAMARGUE;
        cook = getRiceObject(rice);
        cooking = cook.cookRice();
        assertEquals("I am done cooking CAMARGUE", cooking.prepareDinner());
    }
}
