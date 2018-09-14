package esi.dev1.td4;

import java.util.Scanner;

public class Exercice06 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Combien de valeurs voulez−vous entrer?");
        int nbValeursTotal = clavier.nextInt();
        
        int nbPositifs = 0;
        int nbNégatifs = 0;
        int nbNuls = 0;
        int nbValeurs = 0;

        System.out.println("Entrez " + nbValeursTotal + " valeurs");
        while (nbValeurs < nbValeursTotal) {
            int valeur = clavier.nextInt();
           
            if (valeur < 0) {
                nbNégatifs = nbNégatifs + 1;
            } else if (valeur > 0) {
                nbPositifs = nbPositifs + 1;
            } else {
                nbNuls = nbNuls + 1;
            }
            
            nbValeurs = nbValeurs + 1;
        }

        System.out.println("positifs\t: " + nbPositifs);
        System.out.println("négatifs\t: " + nbNégatifs);
        System.out.println("nuls\t\t: " + nbNuls);
    }
}
