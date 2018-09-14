package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice09 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez un nombre d'heure(s): ");
        int heures = clavier.nextInt();

        System.out.println("Entrez un nombre de minute(s): ");
        int minutes = clavier.nextInt();

        System.out.println("Entrez un nombre de seconde(s): ");
        int secondes = clavier.nextInt();

        System.out.print("Le total des secondes est de ");
        System.out.println(heures * 60 * 60 + minutes * 60 + secondes);
    }
}
