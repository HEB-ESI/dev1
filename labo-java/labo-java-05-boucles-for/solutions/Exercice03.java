package esi.dev1.td5;

import java.util.Scanner;

public class Exercice03 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un mot\t: ");
        String mot = clavier.nextLine();
        String miniscule = mot.toLowerCase();
        boolean consonneEnPremier = true;
        switch (miniscule.charAt(0)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                consonneEnPremier = false;
                break;
            default:
            // do nothing
            }
        System.out.print("La première lettre du mot ");
        if (consonneEnPremier) {
            System.out.println("est une consonne");
        } else {
            System.out.println("n'est pas une consonne");

        }
    }
}
