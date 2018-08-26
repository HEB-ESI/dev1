package esi.dev1.td3;

import java.util.Scanner;

public class LectureMultiple2 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.println("Combien de valeurs voulez-vous entrer?");
        int nbValeursTotal = clavier.nextInt();
        int somme = 0;
        int nbValeurs = 1;

        while(nbValeurs < nbValeursTotal) {
            System.out.println("entrez une valeur: ");
            int valeur = clavier.nextInt();
            somme = somme + valeur;
            nbValeurs = nbValeurs+1;
        }
        
        System.out.println("vous avez rentré : "+ nbValeursTotal +" valeurs");
        System.out.println("La somme de toutes ces valeurs: "+ somme);
    }
}
