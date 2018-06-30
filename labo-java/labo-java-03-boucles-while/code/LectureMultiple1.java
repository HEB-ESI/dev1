package esi.dev1.td3;

import java.util.Scanner;

public class LectureMultiple1 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        int somme = 0;
        int i = 1;

        System.out.println("Entrez 10 valeurs");
        while(i <= 10) {
            int valeur = clavier.nextInt();
            somme = somme + valeur;
            i = i+1;
        }
        
        System.out.println("La somme de toutes ces valeurs: "+ somme);
    }
}
