package view;

import java.util.Scanner;

import controller.CocinaController;

public class CocinaView {
    Scanner scanner = new Scanner(System.in);
    private boolean running = true;
    private int seleccion;

    private void showOpciones() {
        System.out.println("\n--- MENÚ PIZZA YUM YUM ---");
        System.out.println("1. cREAR orden");
        System.out.println("0. Salir");
    }

    public CocinaController controller = new CocinaController();
    private OrdenView ordenView = new OrdenView(controller);

    public void inicio(){
        while(running){
            showOpciones();
            seleccion = scanner.nextInt();
            scanner.nextLine();
            try {
                switch (seleccion){
                    case 0:
                        running = false;
                        break;
                    case 1:
                        ordenView.mostrarOrdenView(scanner);
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        break;
                }
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        
        }
    }
}
