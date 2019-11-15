package esi.dev1.td5;

import java.util.Scanner;

public class Exercice101 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un mot\t: ");
        String mot = clavier.nextLine();
        String minuscule = mot.toLowerCase();

        int nbVoyelles = 0;
        int dernierIndice = minuscule.length() - 1;
        int indice = 0;
        while (indice <= dernierIndice) {
            switch (minuscule.charAt(indice)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    nbVoyelles++;
                    break;
                default:
                // do nothing
            }
            indice++;
        }

        int nbConsonnes = mot.length() - nbVoyelles;

        System.out.println("Le nombre de voyelles dans le mot est de " + nbVoyelles);
        System.out.println("Le nombre de consonnes dans le mot est de " + nbConsonnes);
    }
}
