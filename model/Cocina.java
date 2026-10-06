package model;

public class Cocina {
    private Pizza[] pizza = new Pizza[5];
    private Orden[] orden = new Orden[5];

    public void cocinarPizza(){
        System.out.println("se cocina, "+orden[0]);
    }
    public void empaquetarPizzaYQuitarOrdenPizza(){
        System.out.println("se quita"+ orden[0] + "y se envia a "+ pizza[0]); //??? no entiendo mi logica de mi yo del pasado
    }
    public void recibirOrdenCliente(){
        
    }
}
