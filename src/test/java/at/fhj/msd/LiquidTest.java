package at.fhj.msd;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

  
 public class LiquidTest {
 
    private Liquid liquid;
 
    @BeforeEach
    public void setUp() {
        liquid = new Liquid("Water", 1.0, 0.0);
    }
 
    @Test
    public void testGetName() {
        assertEquals("Water", liquid.getName());
    }
 
    @Test
    public void testSetName() {
        liquid.setName("Juice");
        assertEquals("Juice", liquid.getName());
    }
 
    @Test
    public void testGetVolume() {
        assertEquals(1.0, liquid.getVolume(), 0.001);
    }
 
    @Test
    public void testSetVolume() {
        liquid.setVolume(0.5);
        assertEquals(0.5, liquid.getVolume(), 0.001);
    }
 
    @Test
    public void testGetAlcoholPercent() {
        assertEquals(0.0, liquid.getAlcoholPercent(), 0.001);
    }
 
    @Test
    public void testSetAlcoholPercent() {
        liquid.setAlcoholPercent(5.5);
        assertEquals(5.5, liquid.getAlcoholPercent(), 0.001);
    }
}

