package pe.edu.ulima.is2;

import com.yotato.Engine;
import java.util.Scanner;
import motorgfx.Motor;

public class SmartCar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoMotor = args[0];

        MotorManager manager = MotorManager.getInstance(tipoMotor);



        OUTER:
        while (true) {
            System.out.println("******************************************");
            System.out.println("Ingrese los siguientes comandos:");
            System.out.println("(C): Encender el motor");
            System.out.println("(W): Acelerar");
            System.out.println("(S): Frenar");
            System.out.println("(P): Parar el motor");
            System.out.println("(Q): Salir");
            String input = scanner.nextLine();

            switch (input.toUpperCase()) {
                case "Q":
                    // Salir
                    System.out.println("Muchas gracias por utilizar SmartCar");
                    break OUTER;
                case "C":
                    manager.arrancar();
                    break;
                case "W":
                    manager.acelerar();
                    break;
                case "S":
                    manager.frenar();
                    break;
                case "P":
                    double gasolinaGastada = manager.apagar();
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    System.out.println("La gasolina gastada por el motor fue: " + gasolinaGastada);
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    System.out.println();
                    break;
                default:
                    break;
            }

        }
    }
}
