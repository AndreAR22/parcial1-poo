package model;

import constants.Masa;
import constants.Salsa;
import constants.Toppings;

import java.util.ArrayList;

public class Pizza {
    private Masa masa;
    private Salsa salsa;
    private ArrayList<Toppings> toppings;

    public Pizza(Masa masa, Salsa salsa, ArrayList<Toppings> toppings){
        this.masa = masa;
        this.salsa = salsa;
        this.toppings = toppings;
    }

    public Masa getMasa(){
        return masa;
    }

    public void setMasa(Masa masa){
        this.masa = masa;
    }

    public Salsa getSalsa(){
        return salsa;
    }

    public void setSalsa(Salsa salsa){
        this.salsa = salsa;
    }

    public ArrayList<Toppings> getToppings(){
        return toppings;
    }

    public void setToppings(ArrayList<Toppings> toppings){
        this.toppings = toppings;
    }
}
