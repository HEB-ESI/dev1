package esi.dev1.td4;

import java.util.Scanner;

public class Exercice02 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez la longeur de la ligne\t: ");
        int longeur = clavier.nextInt();

        int indice = 0;

        while (indice < longeur) {
            System.out.print("-");
            indice++;
        }

        System.out.println("");
    }
}
