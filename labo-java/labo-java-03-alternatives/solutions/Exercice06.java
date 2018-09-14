package esi.dev1.td3;

import java.util.Scanner;

public class Exercice06 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez le premier nombre\t: ");
        double a = clavier.nextDouble();

        System.out.print("Entrez le second nombre\t\t: ");
        double b = clavier.nextDouble();

        System.out.print("Entrez le dernier nombre\t: ");
        double c = clavier.nextDouble();

        System.out.print("Le maximum est ");
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}
