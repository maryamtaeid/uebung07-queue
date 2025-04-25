package at.fhj.msd;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 
public class SimpleDrinkTest {
 
    private SimpleDrink alcoholicDrink;
    private SimpleDrink nonAlcoholicDrink;
 
    @BeforeEach
    public void setUp() {
        Liquid beer = new Liquid("Beer", 0.5, 5.0); 
        Liquid water = new Liquid("Water", 1.0, 0.0); 
 
        alcoholicDrink = new SimpleDrink("BeerDrink", beer);
        nonAlcoholicDrink = new SimpleDrink("WaterDrink", water);
    }
 
    @Test
    public void testGetVolume() {
        assertEquals(0.5, alcoholicDrink.getVolume(), 0.001);
        assertEquals(1.0, nonAlcoholicDrink.getVolume(), 0.001);
    }
 
    @Test
    public void testGetAlcoholPercent() {
        assertEquals(5.0, alcoholicDrink.getAlcoholPercent(), 0.001);
        assertEquals(0.0, nonAlcoholicDrink.getAlcoholPercent(), 0.001);
    }
 
    @Test
    public void testIsAlcoholic() {
        assertTrue(alcoholicDrink.isAlcoholic());
        assertFalse(nonAlcoholicDrink.isAlcoholic());
    }
 
    @Test
    public void testGetName() {
        assertEquals("BeerDrink", alcoholicDrink.getName());
        assertEquals("WaterDrink", nonAlcoholicDrink.getName());
    }
}
