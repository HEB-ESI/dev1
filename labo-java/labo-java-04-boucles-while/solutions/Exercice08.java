package esi.dev1.td4;

import java.util.Scanner;

public class Exercice08 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez des nombres entiers positifs (terminez par −1)");
        int valeur = clavier.nextInt();

        int sentinelle = -1;

        int maximum = valeur;

        while (valeur > sentinelle) {
            if (valeur >= maximum) {
                maximum = valeur;
            }
            System.out.println("Entrez un nouveau nombre entier positifs: ");
            valeur = clavier.nextInt();
        }
        if (maximum <= sentinelle) {
            System.out.println("Aucun nombre positif entré");
        } else {
            System.out.println("Maximum : " + maximum);

        }

    }
}
