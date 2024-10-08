import java.util.Scanner;

//Ejercicio 2
public class CaloriasQuemadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el peso del usuario
        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Solicitar la duración del ejercicio
        System.out.print("Introduce la duración del ejercicio en minutos: ");
        int duracion = scanner.nextInt();

        // Solicitar el tipo de ejercicio
        System.out.print("Introduce el tipo de ejercicio (correr, nadar, andar en bicicleta): ");
        String tipoEjercicio = scanner.next().toLowerCase();

        double caloriasQuemadas = 0;

        // Calcular las calorías quemadas según el tipo de ejercicio
        if (tipoEjercicio.equals("correr")) {
            caloriasQuemadas = duracion * (0.1 * peso); // 0.1 kcal/kg/min
        } else if (tipoEjercicio.equals("nadar")) {
            caloriasQuemadas = duracion * (0.07 * peso); // 0.07 kcal/kg/min
        } else if (tipoEjercicio.equals("andar en bicicleta")) {
            caloriasQuemadas = duracion * (0.05 * peso); // 0.05 kcal/kg/min
        } else {
            System.out.println("Tipo de ejercicio no válido.");
            return;
        }

        // Mostrar el resultado
        System.out.printf("Calorías quemadas: %.2f kcal%n", caloriasQuemadas);
    }
}
