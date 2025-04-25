package at.fhj.msd;

/**
 * Class represents a simple drink liquid which can be used in drinks
 */
public class SimpleDrink implements Drink {

    private String name;
    protected Liquid l;

    /**
     * Creates a SimpleDrink object with given name and liquid
     *
     * @param name name of drink
     * @param l    only liquid in drink
     */
    public SimpleDrink(String name, Liquid l) {
        this.name = name;
        this.l = l;
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        return l.getAlcoholPercent() > 0;
    }

    /**
     * Gets the name of the drink
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the drink
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
