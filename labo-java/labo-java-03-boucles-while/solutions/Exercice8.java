package g12345.dev1.td3;

import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.println("Entrez des nombres positifs et terminez par -1");
        int valeur = clavier.nextInt(); // première valeur
        int maximum = valeur; // le maximum pour le moment est la première valeur
        
        while(valeur != - 1) {
            if(maximum < valeur) {
                maximum = valeur; // nouveau maximum.
            }
            valeur = clavier.nextInt(); // valeur suivante ou -1.
        }
        System.out.println("maximum: "+ maximum);
    }
}

