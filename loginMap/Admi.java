package loginMap;

import java.util.Scanner;

public class Admi {
    public void Menu(){
        Scanner teclado=new Scanner(System.in);
        Metodos metodos=new Metodos();
        int opcion;
        do {
            System.out.println("++Administado++");
            System.out.println("1-Agregar");
            System.out.println("2-Mostrar");
            System.out.println("3-Modificar");
            System.out.println("4-Eliminar");
            System.out.println("5-Salir");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    metodos.agregar();
                    break;
                case 2:
                    metodos.mostrar();
                    break;
                case 3:
                    metodos.modificar();
                    break;
                case 4:
                    metodos.eliminar();
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }while (opcion!=5);

    }
}
