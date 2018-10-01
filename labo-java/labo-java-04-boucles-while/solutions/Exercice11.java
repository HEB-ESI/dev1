package esi.dev1.td4;

import java.util.Scanner;

public class Exercice11 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez des nombres entiers positifs (terminez par −1)");
        int valeur = clavier.nextInt();

        int sentinelle = -1;

        int antécédent = valeur;

        boolean croissante = false;

        while (valeur > sentinelle) {
            croissante = croissane && (valeur >= antécédent);
            antécédent = valeur;
            System.out.println("Entrez un nouveau nombre entier positifs: ");
            valeur = clavier.nextInt();
        }
        if (croissante) {
            System.out.println("Cette série est strictement croissante");
        } else {
            System.out.println("Cette série n'est pas strictement croissante");

        }

    }
}
