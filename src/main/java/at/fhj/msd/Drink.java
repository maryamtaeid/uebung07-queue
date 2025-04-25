package at.fhj.msd;

/**
 * Interface that defines the basic structure of a drink.
 */
public interface Drink {

    /**
     * Calculates and returns the volume of the drink.
     *
     * @return the volume of the drink in liters
     */
    double getVolume();

    /**
     * Calculates and returns the alcohol percentage of the drink.
     *
     * @return the alcohol volume percentage (e.g., 50 for 50%)
     */
    double getAlcoholPercent();

    /**
     * Determines if the drink is alcoholic or not.
     *
     * @return true if the drink is alcoholic, false otherwise
     */
    boolean isAlcoholic();

    /**
     * Gets the name of the drink.
     *
     * @return the name of the drink
     */
    String getName();

    /**
     * Sets the name of the drink.
     *
     * @param name the new name of the drink
     */
    void setName(String name);
}
