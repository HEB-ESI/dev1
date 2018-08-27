package g12345.dev1.td3;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez 5 valeurs: ");
                
        int somme = 0;
        int valeur;
        int nbValeurs = 0;
        while(nbValeurs<5) {
            valeur = clavier.nextInt();
            somme = somme + valeur;
            nbValeurs = nbValeurs + 1;
        }
        System.out.println("la somme est: "+somme);
        System.out.println("la moyenne est: "+somme/nbValeurs);
    }
}
