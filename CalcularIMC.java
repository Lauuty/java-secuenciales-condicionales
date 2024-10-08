import java.util.Scanner;

//Ejercicio 4
public class CalcularIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el peso en kilogramos
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Solicitar la altura en metros
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Imprimir el IMC
        System.out.printf("Su Índice de Masa Corporal (IMC) es: %.2f\n", imc);

        // Determinar la categoría según el IMC
        if (imc < 18.5) {
            System.out.println("Recomendación: Bajo peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Recomendación: Peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Recomendación: Sobrepeso.");
        } else {
            System.out.println("Recomendación: Obesidad.");
        }

    }
}

