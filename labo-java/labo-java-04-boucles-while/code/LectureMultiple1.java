package esi.dev1.td4;

import java.util.Scanner;

public class LectureMultiple1 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        int somme = 0;
        int nbValeurs = 0;

        System.out.println("Entrez 10 valeurs");
        while(nbValeurs < 10) {
            int valeur = clavier.nextInt();
            somme = somme + valeur;
            nbValeurs = nbValeurs+1;
        }
        
        System.out.println("La somme de toutes ces valeurs: "+ somme);
    }
}
