package g12345.dev1.td3;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.println("Entrez 10 valeurs: ");
        int valeur;
        int nbValeurs = 0;
        while(nbValeurs<10) {
            valeur = clavier.nextInt();
            if(valeur%2 == 0) {
                System.out.println(valeur+  " est pair");
            } else {
                System.out.println(valeur+  " est impair");
            }
            nbValeurs = nbValeurs + 1;
        }
    }
}

