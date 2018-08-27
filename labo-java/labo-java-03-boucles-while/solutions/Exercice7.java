package g12345.dev1.td3;

import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.println("Entrez des nombres et terminez par -1");
        int valeur = clavier.nextInt(); // première valeur
        int premier = valeur;
        int dernier = premier;
        valeur = clavier.nextInt(); // deuxième valeur
        while(valeur != - 1) {
            dernier = valeur;
            valeur = clavier.nextInt(); // valeur suivante ou -1.
        }
        System.out.println("premier: "+ premier);
        System.out.println("dernier: "+ dernier);
    }
}
