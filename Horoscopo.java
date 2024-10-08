import java.util.Scanner;

//SECUENCIALES
//Ejercicio 1
public class Horoscopo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha de nacimiento
        System.out.print("Por favor, introduce tu fecha de nacimiento (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();

        // Dividir la fecha en día, mes y año
        int dia = Integer.parseInt(fechaNacimiento.substring(0, 2));
        int mes = Integer.parseInt(fechaNacimiento.substring(3, 5));
        int anio = Integer.parseInt(fechaNacimiento.substring(6, 10));

        String signo = "";
        String mensaje = "";

        // Determinar el signo del zodiaco y el mensaje de horóscopo
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
            mensaje = "Hoy es un buen día para ser creativo y pensar fuera de la caja.";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
            mensaje = "Escucha tu intuición, te llevará a decisiones acertadas.";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
            mensaje = "Tu energía es contagiosa, comparte tu entusiasmo con los demás.";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
            mensaje = "Es un buen momento para cuidar de ti mismo y disfrutar de los placeres simples.";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
            mensaje = "Las conversaciones serán clave hoy, no temas compartir tus ideas.";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
            mensaje = "Dedica tiempo a tu familia y seres queridos, su apoyo es fundamental.";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
            mensaje = "Hoy es un buen día para brillar y ser el centro de atención.";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
            mensaje = "La organización y el orden te ayudarán a alcanzar tus metas.";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
            mensaje = "El equilibrio en tus relaciones será importante hoy.";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
            mensaje = "Tus emociones están intensas; aprovecha esta energía para profundizar en tus pasiones.";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
            mensaje = "Es un buen día para aventurarte y explorar nuevas ideas.";
        } else {
            signo = "Capricornio";
            mensaje = "La disciplina y la paciencia te llevarán lejos.";
        }

        // Mostrar el resultado
        System.out.println("Tu signo del zodiaco es: " + signo);
        System.out.println(mensaje);

    }
}
