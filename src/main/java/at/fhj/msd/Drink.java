package at.fhj.msd;

/**
 * Abstract base class for concrete drink classes.
 * This class provides common functionality for all drinks.
 */
public abstract class Drink {
    
    /**
     * Name of the drink.
     */
    protected String name;

    /**
     * Creates a Drink object with the given name.
     *
     * @param name the name of the drink
     */
    public Drink(String name) {
        this.name = name;
    }

    /**
     * Calculates and returns the volume of the drink.
     *
     * @return the volume of the drink in liters
     */
    public abstract double getVolume();

    /**
     * Calculates and returns the alcohol percentage of the drink.
     *
     * @return the alcohol volume percentage (e.g., 50 for 50%)
     */
    public abstract double getAlcoholPercent();

    /**
     * Determines if the drink is alcoholic or not.
     *
     * @return true if the drink is alcoholic, false otherwise
     */
    public abstract boolean isAlcoholic();

    /**
     * Gets the name of the drink.
     *
     * @return the name of the drink
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the drink.
     *
     * @param name the new name of the drink
     */
    public void setName(String name) {
        this.name = name;
    }
}
