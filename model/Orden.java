package model;

import constants.Masa;
import constants.Salsa;
import constants.Toppings;

public class Orden {
    private Masa masa;
    private Salsa salsa;
    private Toppings[] toppings;

    public Masa getMasa() {
        return masa;
    }

    public Salsa getSalsa() {
        return salsa;
    }

    public Toppings[] getToppings() {
        return toppings;
    }

    public Orden(Masa masa, Salsa salsa, Toppings[] toppings) {
        this.masa = masa;
        this.salsa = salsa;
        this.toppings = toppings;
    }
}
