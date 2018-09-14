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
            if (valeur % 2 == 0) {
                System.out.println(valeur + " est pair");
            }

            nbValeurs = nbValeurs + 1;
        }
    }
}
