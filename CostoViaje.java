import java.util.Scanner;

//Ejercicio 5
public class CostoViaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la distancia del viaje
        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        // Solicitar el consumo de combustible
        System.out.print("Ingrese el consumo de combustible en litros por kilómetro: ");
        double consumo = scanner.nextDouble();

        // Solicitar el precio del combustible
        System.out.print("Ingrese el precio del combustible por litro: ");
        double precioPorLitro = scanner.nextDouble();

        // Calcular el costo total del viaje
        double litrosNecesarios = distancia * consumo;
        double costoTotal = litrosNecesarios * precioPorLitro;

        // Imprimir el costo total del viaje
        System.out.printf("El costo total del viaje es: %.2f\n", costoTotal);


    }
}

