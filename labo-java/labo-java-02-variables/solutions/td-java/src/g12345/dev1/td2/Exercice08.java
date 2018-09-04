package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice08 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre de seconde(s): ");
        int secondes = clavier.nextInt();

        int minutes = secondes / 60;

        System.out.print("Le nombre de minute(s) dans ");
        System.out.print(secondes);
        System.out.print(" seconde(s) est de ");
        System.out.println(minutes);
    }
}
