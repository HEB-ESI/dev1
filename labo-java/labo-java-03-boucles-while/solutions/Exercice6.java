package g12345.dev1.td3;

import java.util.Scanner;

public class Exercice6 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Combien de valeurs voulez-vous introduire? ");
        int nbValeursTotal = clavier.nextInt();

        int nbPositifs = 0;
        int nbNégatifs = 0;
        int nbNuls = 0;
        int valeur;
        int nbValeurs = 0;
        while (nbValeurs < nbValeursTotal) {
            valeur = clavier.nextInt();
            if(valeur>0) {
                nbPositifs = nbPositifs + 1;
            } else if (valeur < 0) {
                nbNégatifs = nbNégatifs + 1;
            } else {
                nbNuls = nbNuls + 1;
            }
            nbValeurs = nbValeurs + 1;
        }
        System.out.println("positifs: " + nbPositifs);
        System.out.println("négatifs: " + nbNégatifs);
        System.out.println("nuls: " + nbNuls);
    }
}
