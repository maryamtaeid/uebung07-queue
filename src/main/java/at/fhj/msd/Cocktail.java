package at.fhj.msd;

import java.util.List;

public class Cocktail extends Drink {

    private List<Liquid> ingredients;

    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    public List<Liquid> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Liquid> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public double getVolume() {
        double totalVolume = 0;
        for (Liquid l : ingredients) {
            totalVolume += l.getVolume();
        }
        return totalVolume;
    }

    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        if (totalVolume == 0) return 0;

        double alcoholVolume = 0;
        for (Liquid l : ingredients) {
            alcoholVolume += l.getVolume() * (l.getAlcoholPercent() / 100.0);
        }

        return (alcoholVolume / totalVolume) * 100;
    }

    @Override
    public boolean isAlcoholic() {
        for (Liquid l : ingredients) {
            if (l.getAlcoholPercent() > 0) {
                return true;
            }
        }
        return false;
    }
}
