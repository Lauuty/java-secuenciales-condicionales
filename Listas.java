import java.util.Scanner;

//Ejercicio 4
public class Listas {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Definimos listas de reproducción
        String lFeliz = "Happy - Pharrell Williams\n" +
                "Walking on sunshine - Katrina and the Waves\n" +
                "Don´t Worry, Be Happy - Bobby McFerrin\n" +
                "Good Vibrations - The Beach Boys\n" +
                "Upton Funk - Bruno Mars";
        String lTriste = "Tears in Heaven - Eric Clapton\n" +
                "Someone Like You - Adele\n" +
                "Hallelujah - Jeff Buckley\n" +
                "Creep - Radiohead\n" +
                "Fix You - Coldplay";
        String lEnergica = "I Gotta Feeling - The Black Eyed Peas\n" +
                "Shut Up and Dance - WALK THE MOON\n" +
                "Feel It Still - Portugal. The Man\n" +
                "Stronger - Kanye West\n" +
                "Titanium - David Guetta ft. Sia";
        String lRelajada = "Weightless - Marconi Union\n" +
                "River Flows in You - Yiruma\n" +
                "Banana Pancakes - Jack Johnson\n" +
                "Come Away With Me - Norah Jones\n" +
                "Breathe Me - Sia";

        //Le pedimos al usuario que ingrese una opcion segun su estado de animo
        System.out.println("Ingresa una opción numérica segun tu estado de ánimo:");
        System.out.println("(1) Felíz\n (2) Triste\n (3) Enérgico/a\n (4) Relajado/a\n");
        int op = sc.nextInt();

        //Imprimimos la lista de reproduccion acorde al estado de animo del usuario
        switch (op){
            case 1:
                System.out.println(lFeliz);
                break;
            case 2:
                System.out.println(lTriste);
                break;
            case 3:
                System.out.println(lEnergica);
                break;
            case 4:
                System.out.println(lRelajada);
                break;
            default:
                System.out.println("Opción inválida, vuelva a intentarlo");
        }
    }
}
