package esi.dev1.td4;

import java.util.Scanner;

public class Exercice03 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int nbValeursTotal = 5;
        int somme = 0;
        double moyenne = 0;
        int nbValeurs = 0;

        System.out.println("Entrez " + nbValeursTotal + " valeurs");
        while (nbValeurs < nbValeursTotal) {
            int valeur = clavier.nextInt();
            somme = somme + valeur;
            nbValeurs = nbValeurs + 1;
        }

        moyenne = (double) somme / nbValeurs;

        System.out.println("La somme de toutes ces valeurs: " + somme);
        System.out.println("La moyenne de toutes ces valeurs: " + moyenne);
    }

}
