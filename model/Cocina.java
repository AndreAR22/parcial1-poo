package model;

import java.util.ArrayList;

public class Cocina {
    private ArrayList<Pizza> pizzas = new ArrayList<>(); //Se convierte en un ArrayList
    private Orden[] ordenes = new Orden[5];

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public Orden[] getOrdenes() {
        return ordenes;
    }

    public boolean posicionValida(int index){
        return index >= 0 && index < ordenes.length;
    }

    public boolean posicionDisponible(int index){
        return ordenes[index] == null;
    }

    public void addOrden(Orden orden){
        for(int i = 0; i < ordenes.length; i++){
            if(ordenes[i] == null){
                ordenes[i] = orden;
                return;
            }
        }
        throw new IllegalArgumentException("La cocina no tiene espacio para más órdenes");
    }

    public void removeOrden(int index){
        ordenes[index] = null;
    }

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public void removePizza(int index){
        pizzas.remove(index);
    }

    public int totalPizzas(){
        return pizzas.size();
    }
}
