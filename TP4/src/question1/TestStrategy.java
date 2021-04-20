package question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStrategy {
    @Test
    public void testCreoleRice() {
        Cook cook = new Cook();
        cook.setStrategy(new CreoleStrategy());
        assertEquals(RiceCookingWays.CREOLE, cook.cookRice());
    }

    @Test
    public void testPilafRice() {
        Cook cook = new Cook();
        cook.setStrategy(new PilafStrategy());
        assertEquals(RiceCookingWays.PILAF, cook.cookRice());
    }

    @Test
    public void testSteamRice() {
        Cook cook = new Cook();
        cook.setStrategy(new SteamStrategy());
        assertEquals(RiceCookingWays.STEAM, cook.cookRice());
    }

    @Test
    public void testRisottoRice() {
        Cook cook = new Cook();
        cook.setStrategy(new RisottoStrategy());
        assertEquals(RiceCookingWays.RISOTTO, cook.cookRice());
    }
}
