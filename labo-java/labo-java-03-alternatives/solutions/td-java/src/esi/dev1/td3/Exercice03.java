package esi.dev1.td3;

import java.util.Scanner;

public class Exercice03 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un premier nombre\t: ");
        double premierNb = clavier.nextDouble();

        System.out.print("Entrez un second nombre\t\t: ");
        double secondNb = clavier.nextDouble();

        System.out.print("Le plus grand nombre est ");
        
        if (premierNb >= secondNb) {
            System.out.println(premierNb);
        } else {
            System.out.println(secondNb);
        }

    }
}
