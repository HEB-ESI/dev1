package esi.dev1.td4;

import java.util.Scanner;

public class Exercice04 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int nbValeursTotal = 10;
        int nbValeurs = 0;

        System.out.println("Entrez " + nbValeursTotal + " valeurs");
        while (nbValeurs < nbValeursTotal) {
            int valeur = clavier.nextInt();
            System.out.print(valeur + " est ");
            if (valeur % 2 == 0) {
                System.out.println("pair");
            } else {
                System.out.println("impair");
            }

            nbValeurs = nbValeurs + 1;
        }
    }
}
