package esi.dev1.td4;

import java.util.Scanner;

public class Exercice01 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un nombre entier\t: ");
        int n = clavier.nextInt();

        System.out.println("les nombres de 1 à " + n);
        int indice = 1;

        while (indice <= n) {
            System.out.print(indice);
            System.out.print("\t");
            indice++;
        }

        System.out.println("");

        
        System.out.println("les nombres pairs qui sont compris entre 1 et " + n);
        indice = 1;
        while (indice <= n) {
            if (indice % 2 == 0) {
                System.out.print(indice);
                System.out.print("\t");
            }
            indice++;
        }

        System.out.println("");

        
        System.out.println("les nombres de -" + n + " à " + n);
        indice = -n;
        while (indice <= n) {

            System.out.print(indice);
            System.out.print("\t");

            indice++;
        }

        System.out.println("");

        
        System.out.println("les multiples de 5 qui sont compris entre 1 et " + n);
        indice = 1;
        while (indice <= n) {
            if (indice % 5 == 0) {
                System.out.print(indice);
                System.out.print("\t");
            }
            indice++;
        }

        System.out.println("");

        
        System.out.println("les multiples de " + n + " compris entre 1 et 100");
        indice = 1;
        int maximum = 100;
        while (indice <= maximum) {
            if (indice % n == 0) {
                System.out.print(indice);
                System.out.print("\t");
            }
            indice++;
        }
    }
}
