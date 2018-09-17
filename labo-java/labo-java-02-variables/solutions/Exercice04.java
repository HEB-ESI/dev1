package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice04 {

    public static void main(String[] args) {
        double pi = 3.141593;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le rayon du cercle en mètre: ");
        double rayon = clavier.nextDouble();

        System.out.print("Le périmètre du cercle vaut: ");
        System.out.print(2 * pi * rayon);
        System.out.println(" mètre(s)");

        System.out.print("L’aire du cercle vaut: ");
        System.out.print(pi * rayon * rayon);
        System.out.println(" mètre(s) carré");
    }
}
