package esi.dev1.td5;

import java.util.Scanner;

public class Exercice102 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un mot\t: ");
        String mot = clavier.nextLine();
        String minuscule = mot.toLowerCase();

        int longueur = mot.length();
        boolean estPalindrome = true;

        int indice = 0;
        while (estPalindrome && indice < longueur / 2) {
            if (minuscule.charAt(indice) != minuscule.charAt(longueur - indice - 1)) {
                estPalindrome = false;
            }
            indice++;
        }
        System.out.println("Le mot est-il un palindrome : " + estPalindrome);
    }
}
