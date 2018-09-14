package esi.dev1.td5;

import java.util.Scanner;

public class Exercice04 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un mot\t: ");
        String mot = clavier.nextLine();
        String miniscule = mot.toLowerCase();
        int nbLettres = miniscule.length() - 1;
        boolean identique = miniscule.charAt(0) == miniscule.charAt(nbLettres);
        System.out.print("La première et la dernière lettre ");
        if (identique) {
            System.out.println("sont identiques");
        } else {
            System.out.println("ne sont pas identiques");

        }
    }
}
