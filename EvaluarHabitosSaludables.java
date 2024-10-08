import java.util.Scanner;

//Ejercicio 6
public class EvaluarHabitosSaludables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar horas de sueño
        System.out.print("¿Cuántas horas al día duerme? ");
        int horasSueño = scanner.nextInt();

        // Solicitar horas de ejercicio
        System.out.print("¿Cuántas horas al día hace ejercicio? ");
        int horasEjercicio = scanner.nextInt();

        // Solicitar comidas saludables
        System.out.print("¿Cuántas comidas saludables consume al día? ");
        int comidasSaludables = scanner.nextInt();

        // Evaluar hábitos saludables
        if (horasSueño >= 7 && horasEjercicio >= 1 && comidasSaludables >= 3) {
            System.out.println("¡Tus hábitos son excelentes! Sigue así.");
        } else if (horasSueño < 7 && horasEjercicio < 1 && comidasSaludables < 3) {
            System.out.println("Tus hábitos necesitan mejorar. Intenta dormir más, hacer ejercicio y comer más saludablemente.");
        } else {
            System.out.println("Tienes algunos buenos hábitos, pero aún hay áreas en las que puedes mejorar.");
        }

    }
}

