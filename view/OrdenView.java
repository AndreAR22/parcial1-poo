package view;

import controller.CocinaController;
import java.util.Scanner;

import constants.Masa;
import constants.Salsa;
import constants.Toppings;

import java.util.ArrayList;

public class OrdenView {
    private boolean running;
    private CocinaController controller;
    private int seleccion;

    public OrdenView(CocinaController controller) {
        this.controller = controller;
    }

    private void showOpcionesOrden() {
        System.out.println("\n--- Orden ---");
        System.out.println("1. Tipo de Masa");
        System.out.println("2. TIpo de Salsa");
        System.out.println("3. Agregar Topping");
        System.out.println("4. Finalizar");
        System.out.println("0. salir y no pedir :(");
    }

    private Masa masaSeleccionada;
    private Salsa salsaSeleccionada;
    private ArrayList<Toppings> toppingsSeleccionados;

    public void mostrarOrdenView(Scanner scanner) {
        masaSeleccionada = Masa.NORMAL;
        salsaSeleccionada = Salsa.NORMAL;
        toppingsSeleccionados = new ArrayList<>();

        running = true;
        while(running){
            showOpcionesOrden();
            seleccion = scanner.nextInt();
            scanner.nextLine();
            switch (seleccion) {
                case 0:
                    running = false;
                    break;
                case 1:
                    for (Masa masa : Masa.values()) {
                        System.out.println(masa.ordinal()+1 + ". " + masa);
                    }
                    this.masaSeleccionada = Masa.values()[scanner.nextInt()-1];
                    scanner.nextLine();
                    break;
                case 2:
                    for (Salsa salsa : Salsa.values()) {
                        System.out.println(salsa.ordinal()+1 + ". " + salsa);
                    }
                    this.salsaSeleccionada = Salsa.values()[scanner.nextInt()-1];
                    scanner.nextLine();
                    break;
                case 3:
                    for(int i = 0; i < Toppings.values().length; i++){
                        System.out.println((i+1) + ". " + Toppings.values()[i]);
                    }
                    toppingsSeleccionados.add(Toppings.values()[scanner.nextInt()-1]);
                    scanner.nextLine();                    
                    break;
                case 4:
                    if(toppingsSeleccionados.isEmpty()){
                        throw new IllegalArgumentException("Debes agregar al menos un topping");
                    }
                    
                    controller.recibirOrdenCliente(masaSeleccionada, salsaSeleccionada, toppingsSeleccionados);
                    running = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

        }
    }
}
