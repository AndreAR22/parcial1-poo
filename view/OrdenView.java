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

    private void showOpcionesPuntosAcceso() {
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
        running = true;
        while(running){
            showOpcionesPuntosAcceso();
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
                    for (Toppings topping : Toppings.values()) {
                        System.out.println(topping.ordinal()+1 + ". " + topping);
                    }
                    this.toppingsSeleccionados.add(Toppings.values()[scanner.nextInt()-1]);
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        
    }
}
