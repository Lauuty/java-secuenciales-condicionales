import java.util.Random;
import java.util.Scanner;

//Ejercicio 5
public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Opciones disponibles
        String[] opciones = {"piedra", "papel", "tijera"};

        // Solicitar la elección del usuario
        System.out.print("Elija piedra, papel o tijera: ");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        // Elegir opción al azar para la computadora
        String eleccionComputadora = opciones[random.nextInt(opciones.length)];

        // Imprimir la elección de la computadora
        System.out.println("La computadora eligió: " + eleccionComputadora);

        // Determinar el ganador
        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("¡Es un empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else if (eleccionUsuario.equals("piedra") || eleccionUsuario.equals("papel") || eleccionUsuario.equals("tijera")) {
            System.out.println("¡Perdiste!");
        } else {
            System.out.println("Elección no válida. Por favor, elige piedra, papel o tijera.");
        }

    }
}

