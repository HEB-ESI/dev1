package esi.dev1.td3;

import java.util.Scanner;

public class Exercice07 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez la longeur du premier côté\t: ");
        double côté1 = clavier.nextDouble();

        System.out.print("Entrez la longeur du second côté\t: ");
        double côté2 = clavier.nextDouble();

        System.out.print("Entrez la longeur du troisième côté\t: ");
        double côté3 = clavier.nextDouble();

        System.out.print("Le triangle est ");

        if (côté1 == côté2 && côté2 == côté3) {
            System.out.println("équilatéral");
        } else if (côté1 == côté2 || côté2 == côté3 || côté1 == côté3) {
            System.out.println("isocèle");
        } else {
            System.out.println("quelconque.");
        }
    }
}
