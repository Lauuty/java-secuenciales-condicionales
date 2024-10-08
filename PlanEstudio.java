import java.util.Scanner;

//Ejercicio 6
public class PlanEstudio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar cuántas horas al día puede estudiar
        System.out.print("¿Cuántas horas al día puede estudiar? ");
        int horasDiarias = scanner.nextInt();

        // Definir las materias y la distribución de horas
        String[] materias = {"Matemáticas", "Ciencias", "Historia", "Lengua", "Inglés"};
        int[] horasPorMateria = new int[materias.length];

        // Calcular las horas totales a la semana
        int horasTotalesSemana = horasDiarias * 7;

        // Distribuir horas entre las materias
        for (int i = 0; i < materias.length; i++) {
            if (horasTotalesSemana > 0) {
                // Asignar horas a cada materia
                horasPorMateria[i] = horasTotalesSemana / (materias.length - i);
                horasTotalesSemana -= horasPorMateria[i];
            } else {
                horasPorMateria[i] = 0;
            }
        }

        // Imprimir el plan de estudio
        System.out.println("\nPlan de estudio semanal:");
        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i] + ": " + horasPorMateria[i] + " horas");
        }

    }
}

