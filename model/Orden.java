package model;

import constants.Masa;
import constants.Salsa;
import constants.Toppings;

import java.util.ArrayList;

public class Orden {
    private Masa masa;
    private Salsa salsa;
    private ArrayList<Toppings> toppings; //se cambia a arrayList

    public Masa getMasa() {
        return masa;
    }

    public Salsa getSalsa() {
        return salsa;
    }

    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    public Orden(Masa masa, Salsa salsa, ArrayList<Toppings> toppings) {
        this.masa = masa;
        this.salsa = salsa;
        this.toppings = toppings;
    }
}
