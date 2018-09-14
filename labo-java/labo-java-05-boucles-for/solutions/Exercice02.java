package esi.dev1.td5;

import java.util.Scanner;

public class Exercice02 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un mot\t: ");
        String mot = clavier.nextLine();
        String miniscule = mot.toLowerCase();
        boolean voyelleEnPremier = false;
        switch (miniscule.charAt(0)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                voyelleEnPremier = true;
                break;
            default:
            // do nothing
            }
        System.out.print("La première lettre du mot ");
        if (voyelleEnPremier) {
            System.out.println("est une voyelle");
        } else {
            System.out.println("n'est pas une voyelle");

        }
    }
}
