package esi.dev1.td8;
import java.util.Scanner;

public class Saisie {

    /**
     * Lecture robuste d'un entier. 
     * Tant que l'entrée de l'utilisateur n'est pas
     * un entier la méthode demande une nouvelle entrée.
     *
     * @param message message à afficher.
     * @return l'entier saisi par l'utilisateur.
    */
    static int saisieEntier(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.println(message);
        while(!clavier.hasNextInt()) { //si l'entrée saisie n'est pas un entier
            clavier.next(); // on n'en fait rien, on attend une nouvelle entrée
            System.out.println("Le nombre saisi n'est pas un entier.");
            System.out.println(message);
        }
        return clavier.nextInt();
    }
    
    public static void main(String[] args) {
        int année = saisieEntier("Entrez votre année de naissance: ");
        System.out.println("Vous avez " + (2018-année) + " ans");
    }
}
