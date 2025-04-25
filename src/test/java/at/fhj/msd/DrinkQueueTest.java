package at.fhj.msd;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestDrink implements Drink {

    private String name;

    public TestDrink(String name) {
        this.name = name;
    }

    @Override
    public double getVolume() {
        return 0.33;
    }

    @Override
    public double getAlcoholPercent() {
        return 0.0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

public class DrinkQueueTest {

    private DrinkQueue drinkQueue;

    @BeforeEach
    public void setUp() {
        drinkQueue = new DrinkQueue();
    }

    @Test
    public void testAddDrinkAndPeekDrink() {
        Drink drink = new TestDrink("Cola");
        drinkQueue.addDrink(drink);
        assertEquals("Cola", drinkQueue.peekDrink().getName());
    }

    @Test
    public void testIsEmptyInitially() {
        assertTrue(drinkQueue.isEmpty());
    }

    @Test
    public void testIsEmptyAfterAddingDrink() {
        drinkQueue.addDrink(new TestDrink("Fanta"));
        assertFalse(drinkQueue.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, drinkQueue.size());
        drinkQueue.addDrink(new TestDrink("Sprite"));
        assertEquals(1, drinkQueue.size());
        drinkQueue.addDrink(new TestDrink("Water"));
        assertEquals(2, drinkQueue.size());
    }

    @Test
    public void testPrintQueue() {
        drinkQueue.addDrink(new TestDrink("Pepsi"));
        drinkQueue.addDrink(new TestDrink("Juice"));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        drinkQueue.printQueue();

        String expectedOutput = "Pepsi\nJuice\n";
        assertEquals(expectedOutput, outContent.toString());

        // برگرداندن System.out به حالت عادی
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }
}
