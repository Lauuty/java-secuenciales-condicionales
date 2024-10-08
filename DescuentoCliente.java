import java.util.Scanner;

//Ejercicio 2
public class DescuentoCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        // Solicitar la categoría del cliente
        System.out.print("Ingrese la categoría del cliente (estudiante, adulto, jubilado): ");
        String categoria = scanner.nextLine().toLowerCase();

        double descuento = 0;

        // Determinar el descuento según la categoría
        if (categoria.equals("estudiante")) {
            descuento = 0.10; // 10%
        } else if (categoria.equals("adulto")) {
            descuento = 0.05; // 5%
        } else if (categoria.equals("jubilado")) {
            descuento = 0.15; // 15%
        } else {
            System.out.println("Categoría no reconocida. No se aplicará descuento.");
        }

        // Calcular el precio final
        double precioFinal = precioOriginal - (precioOriginal * descuento);

        // Imprimir el precio final
        System.out.printf("El precio final después del descuento es: %.2f\n", precioFinal);

    }
}

