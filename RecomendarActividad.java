import java.util.Scanner;

//Ejercicio 7
public class RecomendarActividad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el estado de ánimo del usuario
        System.out.print("Ingrese su estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        // Recomendar una actividad según el estado de ánimo
        if (estadoAnimo.equals("feliz")) {
            System.out.println("¡Disfruta de una salida con amigos!");
        } else if (estadoAnimo.equals("triste")) {
            System.out.println("Te recomiendo ver una película divertida.");
        } else if (estadoAnimo.equals("enérgico")) {
            System.out.println("¡Sal a hacer ejercicio o practica un deporte!");
        } else if (estadoAnimo.equals("relajado")) {
            System.out.println("Prueba meditar o leer un buen libro.");
        } else {
            System.out.println("Estado de ánimo no reconocido. Por favor, elige entre feliz, triste, enérgico o relajado.");
        }

    }
}
