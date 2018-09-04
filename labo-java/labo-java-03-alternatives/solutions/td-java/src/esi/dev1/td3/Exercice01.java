package esi.dev1.td3;

import java.util.Scanner;

public class Exercice01 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez votre âge: ");
        int âge = clavier.nextInt();

        if (âge >= 18) {
            System.out.print("vous êtes majeur.");
        }

    }
}
