package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le rayon du cercle: ");
        double rayon = clavier.nextDouble();
        double pi = 3.141593;
        System.out.println("Le périmètre du cercle vaut: " + 2*pi*rayon);
        System.out.println("L'aire du cercle vaut: " + pi*rayon*rayon);
    }
}
