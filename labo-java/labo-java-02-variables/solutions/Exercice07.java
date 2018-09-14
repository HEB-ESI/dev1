package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice07 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre entier compris entre 0 et 999: ");
        int nb = clavier.nextInt();

        System.out.print("Le nombre miroir de ");
        System.out.print(nb);
        System.out.print(" est ");
        System.out.print(nb % 10);
        System.out.print((nb / 10) % 10);
        System.out.println((nb / 100) % 10);
    }
}
