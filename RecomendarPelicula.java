import java.util.Scanner;

//CONDICIONALES
//Ejercicio 1
public class RecomendarPelicula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el género de película favorito
        System.out.print("Ingrese su género de película favorito (acción, comedia, drama, ciencia ficción): ");
        String genero = scanner.nextLine().toLowerCase();

        // Recomendar una película según el género
        if (genero.equals("acción")) {
            System.out.println("Te recomiendo ver 'Mad Max: Fury Road'.");
        } else if (genero.equals("comedia")) {
            System.out.println("Te recomiendo ver 'Superbad'.");
        } else if (genero.equals("drama")) {
            System.out.println("Te recomiendo ver 'The Shawshank Redemption'.");
        } else if (genero.equals("ciencia ficción")) {
            System.out.println("Te recomiendo ver 'Inception'.");
        } else {
            System.out.println("Género no reconocido. Por favor, elige entre acción, comedia, drama o ciencia ficción.");
        }

    }
}
