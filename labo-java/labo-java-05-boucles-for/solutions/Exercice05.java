package esi.dev1.td5;

import java.util.Scanner;

public class Exercice05 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un mot\t: ");
        String mot = clavier.nextLine();
        String minuscule = mot.toLowerCase();
        int nbLettres = minuscule.length() - 1;
        System.out.print("Le mot mirroir est ");
        for (int indice = nbLettres; indice >= 0; indice--) {
            System.out.print(minuscule.charAt(indice));
        }
        System.out.println("");
    }
}
