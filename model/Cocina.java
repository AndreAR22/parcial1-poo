package model;

import java.util.ArrayList;

public class Cocina {
    private ArrayList<Pizza> pizza; //Se convierte en un ArrayList
    private Orden[] orden = new Orden[5];

    //Se mueve a CocinaController para que lo maneje
    
    public ArrayList<Pizza> getPizzas() {
        return pizza;
    }
    public Orden[] getOrdenes() {
        return orden;
    }

}
