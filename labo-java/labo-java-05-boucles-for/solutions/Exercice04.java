package esi.dev1.td5;

import java.util.Scanner;

public class Exercice04 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un mot\t: ");
        String mot = clavier.nextLine();
        String minuscule = mot.toLowerCase();
        int dernierIndice = minuscule.length() - 1;
        boolean identique = minuscule.charAt(0) == minuscule.charAt(dernierIndice);
        System.out.print("La première et la dernière lettre ");
        if (identique) {
            System.out.println("sont identiques");
        } else {
            System.out.println("ne sont pas identiques");

        }
    }
}
