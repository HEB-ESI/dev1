package esi.dev1.td4;

import java.util.Scanner;

public class Exercice07 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez des nombres entiers positifs (terminez par −1)");
        int valeur = clavier.nextInt();

        int sentinelle = -1;

        int premier = valeur;
        int dernier = valeur;

        while (valeur > sentinelle) {
            dernier = valeur;
            System.out.println("Entrez un nouveau nombre entier positif: ");
            valeur = clavier.nextInt();
        }

        if (premier <= sentinelle) {
            System.out.println("Aucun nombre positif entré");
        } else {
            System.out.println("Premier : " + premier);
            System.out.println("Dernier : " + dernier);
        }

    }
}
