package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice06 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre entier compris entre 0 et 999: ");
        int nb = clavier.nextInt();

        System.out.print("les unités\t:\t");
        System.out.println(nb % 10);
        System.out.print("les dizaines\t:\t");
        System.out.println((nb / 10) % 10);
        System.out.print("les centaines\t:\t");
        System.out.println((nb / 100) % 10);
    }
}
