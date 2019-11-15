package esi.dev1.td5;

import java.util.Scanner;

public class Exercice06 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un mot\t: ");
        String mot = clavier.nextLine();
        String minuscule = mot.toLowerCase();
        int dernierIndice = minuscule.length() - 1;
        for (int indice = 0; indice <= dernierIndice; indice++) {
            switch (minuscule.charAt(indice)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print(minuscule.charAt(indice));
                    break;
                default:
                // do nothing
            }
        }
        System.out.println("");
    }
}
