package at.fhj.msd;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Liquid vodka = new Liquid("Vodka", 0.05, 40);
        Liquid orangeJuice = new Liquid("Orange Juice", 0.2, 0);

        Cocktail screwdriver = new Cocktail("Screwdriver", List.of(vodka, orangeJuice));

        System.out.println("Name: " + screwdriver.getName());
        System.out.println("Total volume: " + screwdriver.getVolume() + " l");
        System.out.println("Alcohol %: " + screwdriver.getAlcoholPercent());
        System.out.println("Is Alcoholic? " + screwdriver.isAlcoholic());
    }
}
