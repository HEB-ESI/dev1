package esi.dev1.td3;

import java.util.Scanner;

public class Exercice02 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un nombre entier: ");
        int nb = clavier.nextInt();

        if (nb % 2 == 0) {
            System.out.print("ce nombre est pair.");
        } else {
            System.out.print("ce nombre est impair.");

        }

    }
}
