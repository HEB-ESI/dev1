package esi.dev1.td5;

import java.util.Scanner;

public class Exercice08 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez du texte\t: ");
        String texte = clavier.nextLine();
        if (texte.equals("OK ÉSI")) {
            System.out.println("Je vous écoute !");
        } else {
            System.out.println("Je n'ai pas compris");
        }
    }
}
