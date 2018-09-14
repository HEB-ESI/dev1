package esi.dev1.td4;

import java.util.Scanner;

public class Exercice09 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        //Remarquez ne traite pas le cas où
        //l'utilisateur entre des valeurs négatives ou nulles.
        System.out.println("Combien de valeurs voulez−vous entrer?");
        int nbValeursTotal = clavier.nextInt();

        System.out.println("Entrez " + nbValeursTotal + " valeurs");
        int valeur = clavier.nextInt();
        int minimum = valeur;
        int maximum = valeur;

        //Une première valeur a déjà été entrée
        //le compteur démarre à 1.
        int nbValeurs = 1;

        while (nbValeurs < nbValeursTotal) {
            valeur = clavier.nextInt();

            if (valeur > maximum) {
                maximum = valeur;
            }
            if (valeur < minimum) {
                minimum = valeur;
            }

            nbValeurs = nbValeurs + 1;
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}
