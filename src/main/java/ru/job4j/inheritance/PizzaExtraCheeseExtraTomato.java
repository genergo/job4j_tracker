package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {

    private static final String NAME = " + extra Tomato";

    public PizzaExtraCheeseExtraTomato(String name) {
        super(name);
    }

    public String name() {
        return super.name() + NAME;
    }
}
