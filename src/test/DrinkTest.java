package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDrink extends Drink {
    public TestDrink(String name) {
        super(name);
    }

    @Override
    public double getVolume() {
        return 0.33;
    }

    @Override
    public double getAlcoholPercent() {
        return 5.0;
    }

    @Override
    public boolean isAlcoholic() {
        return getAlcoholPercent() > 0.0;
    }
}

public class DrinkTest {

    private TestDrink drink;

    @BeforeEach
    public void setUp() {
        drink = new TestDrink("TestBeer");
    }

    @Test
    public void testGetName() {
        assertEquals("TestBeer", drink.getName());
    }

    @Test
    public void testSetName() {
        drink.setName("TestWine");
        assertEquals("TestWine", drink.getName());
    }

    @Test
    public void testGetVolume() {
        assertEquals(0.33, drink.getVolume(), 0.001);
    }

    @Test
    public void testGetAlcoholPercent() {
        assertEquals(5.0, drink.getAlcoholPercent(), 0.001);
    }

    @Test
    public void testIsAlcoholic() {
        assertTrue(drink.isAlcoholic());
    }
}
