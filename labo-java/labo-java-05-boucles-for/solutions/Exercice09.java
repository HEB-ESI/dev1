package esi.dev1.td5;

import java.util.Scanner;

public class Exercice07 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez une pharase\t: ");
        String phrase = clavier.nextLine();
        int dernierIndice = phrase.length() - 1;

        boolean commenceParMajuscule = Character.isUpperCase(phrase.charAt(0));
        System.out.print("La première lettre ");
        if (commenceParMajuscule) {
            System.out.println("est une majuscule");
        } else {
            System.out.println("n'est pas une majuscule");
        }

        boolean termineParPoint = phrase.charAt(dernierIndice) == '.';
        System.out.print("Le dernièr caractère ");
        if (termineParPoint) {
            System.out.println("est un point");
        } else {
            System.out.println("n'est pas un point");
        }
        
    }
}
