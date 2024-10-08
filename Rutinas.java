import java.util.Scanner;

//Ejercicio 3
public class Rutinas {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String principiante = "Ej 1: Media sentadilla 4x12, Ej 2: Lagartijas 3x15, Ej 3: Salto tijera 4x25";
        String intermedio = "Ej 1: Estocadas 4x12, Ej 2 Dominadas 3x10, Ej 3: Burpees: 4x25";
        String avanzado = "Ej 1: Sentadilla búlgara 3x15. Ej 2: Fondos 4x12, Ej 3: Salto en soga 4x50";

        System.out.println("Ingresa tu nivel de condición física para asignarte una rutina: ");
        System.out.println("(1) Principiante");
        System.out.println("(2) Intermedio");
        System.out.println("(3) Avanzado");
        int op = sc.nextInt();

        switch (op){
            case 1:
                System.out.println(principiante);
                break;
            case 2:
                System.out.println(intermedio);
                break;
            case 3:
                System.out.println(avanzado);
                break;
            default:
                System.out.println("Opción inválida, vuelva a intentarlo");
        }


    }
}
