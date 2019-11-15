package esi.dev1.td5;

import java.util.Scanner;

public class Exercice01 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un nombre entier\t: ");
        int n = clavier.nextInt();

        System.out.println("les nombres de 1 à " + n);
        for (int indice = 1; indice <= n; indice++) {
            System.out.print(indice);
            System.out.print("\t");
        }

        System.out.println("");

        System.out.println("les nombres pairs qui sont compris entre 1 et " + n);

        System.out.print("version 1 : "); // préférée
        for (int indice = 2; indice <= n; indice+=2) {
            System.out.print(indice);
            System.out.print("\t");
        }
        System.out.println();        
        System.out.print("version 2 : ");
        for (int indice = 1; indice <= n; indice++) {
            if (indice % 2 == 0) {
                System.out.print(indice);
                System.out.print("\t");
            }
        }

        System.out.println();
        

        System.out.println("les nombres de -" + n + " à " + n);
        for (int indice = -n; indice <= n; indice++) {
            System.out.print(indice);
            System.out.print("\t");
        }

        System.out.println("");

        System.out.println("les multiples de 5 qui sont compris entre 1 et " + n);
        System.out.print("version 1 : "); // préférée
        for (int indice = 5; indice <= n; indice+=5) {
            System.out.print(indice);
            System.out.print("\t");
        }
        System.out.println();        
        System.out.print("version 2 : ");
        for (int indice = 1; indice <= n; indice++) {
            if (indice % 5 == 0) {
                System.out.print(indice);
                System.out.print("\t");
            }
        }

        System.out.println("");

        System.out.println("les multiples de " + n + " compris entre 1 et 100");
        int maximum = 100;
        System.out.print("version 1 : "); // préférée
        for (int indice = n; indice <= maximum; indice+=n) {
                System.out.print(indice);
                System.out.print("\t");
        }
        System.out.println();        
        System.out.print("version 2 : ");
        for (int indice = 1; indice <= maximum; indice++) {
            if (indice % n == 0) {
                System.out.print(indice);
                System.out.print("\t");
            }
        }
        System.out.println();
        
    }
}
