package loginMap;

import loginMap.Admi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Admi admi=new Admi();
        User user=new User();
        int opcion;
        do {
            System.out.println("++Menu++");
            System.out.println("1-loginMap.User");
            System.out.println("2-Administrador");
            System.out.println("3-Salir");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    user.login();
                    break;
                case 2:
                    admi.Menu();
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }while(opcion!=3);

    }
}
