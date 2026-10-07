package controller;

import constants.Masa;
import constants.Salsa;
import constants.Toppings;
import model.Cocina;
import model.Orden;
import model.Pizza;

import java.util.ArrayList;

public class CocinaController {
    private Cocina cocina;

    public CocinaController(){
        this.cocina = new Cocina();
    }

    public void recibirOrdenCliente(Masa masa, Salsa salsa, ArrayList<Toppings> toppings){
        Orden orden = new Orden(masa, salsa, toppings);
        cocina.addOrden(orden);
        System.out.println("Orden recibida" + orden);
    }

    public void cocinarPedido(int index){
        if(!cocina.posicionValida(index)){
            throw new IllegalArgumentException("index invalido");
        }
        if(cocina.posicionDisponible(index)){
            throw new IllegalArgumentException("no hay una orden en esa posición");
        }
        Orden orden = cocina.getOrdenes()[index];
        Pizza pizza = new Pizza(orden.getMasa(), orden.getSalsa(), orden.getToppings());
        cocina.addPizza(pizza);
        cocina.removeOrden(index);
        System.out.println("Pizza cocinada " + pizza);
    }

    public void empaquetarPizza(int index){
        if(index < 0 || index >= cocina.totalPizzas()){
            throw new IllegalArgumentException("pizza no existente");
        }
        cocina.removePizza(index);
        System.out.println("Pizza no. " + (index + 1) + " empaquetada y enviada al cliente");
    }

    public Cocina getCocina() {
        return cocina;
    }
}
