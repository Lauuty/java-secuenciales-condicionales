import java.util.Scanner;

//Ejercicio 7
public class IndiceFelicidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar factores de felicidad
        System.out.print("Ingrese su nivel de satisfacción con la vida (1-10): ");
        int satisfaccionVida = scanner.nextInt();

        System.out.print("Ingrese su nivel de estrés (1-10): ");
        int nivelEstres = scanner.nextInt();

        System.out.print("Ingrese su nivel de salud (1-10): ");
        int nivelSalud = scanner.nextInt();

        // Validar que los valores estén en el rango correcto
        if (satisfaccionVida < 1 || satisfaccionVida > 10 ||
                nivelEstres < 1 || nivelEstres > 10 ||
                nivelSalud < 1 || nivelSalud > 10) {
            System.out.println("Por favor, ingrese valores entre 1 y 10.");
        } else {
            // Calcular el índice de felicidad
            // Consideramos que un menor nivel de estrés es mejor
            double indiceFelicidad = (satisfaccionVida + (11 - nivelEstres) + nivelSalud) / 3.0;

            // Imprimir el índice de felicidad
            System.out.printf("Su índice de felicidad es: %.2f\n", indiceFelicidad);
        }


    }
}

