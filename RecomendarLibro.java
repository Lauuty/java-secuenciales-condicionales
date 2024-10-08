import java.util.Scanner;

//Ejercicio 3
public class RecomendarLibro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el género de libro favorito
        System.out.print("Ingrese su género de libro favorito (fantasía, misterio, romance, ciencia ficción): ");
        String genero = scanner.nextLine().toLowerCase();

        // Recomendar un libro según el género
        if (genero.equals("fantasía")) {
            System.out.println("Te recomiendo leer 'El Hobbit' de J.R.R. Tolkien.");
        } else if (genero.equals("misterio")) {
            System.out.println("Te recomiendo leer 'La chica del tren' de Paula Hawkins.");
        } else if (genero.equals("romance")) {
            System.out.println("Te recomiendo leer 'Orgullo y prejuicio' de Jane Austen.");
        } else if (genero.equals("ciencia ficción")) {
            System.out.println("Te recomiendo leer 'Dune' de Frank Herbert.");
        } else {
            System.out.println("Género no reconocido. Por favor, elige entre fantasía, misterio, romance o ciencia ficción.");
        }

    }
}

