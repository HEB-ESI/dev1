package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice11 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez le prix unitaire: ");
        double prixHorsTVA = clavier.nextDouble();

        System.out.println("Entrez le taux de TVA en %: ");
        int tva = clavier.nextInt();

        System.out.println("Entrez la quantité achetée: ");
        int quantité = clavier.nextInt();

        double prix = prixHorsTVA * (1 + tva / 100.);
        double montantAchat = prix * quantité;

        System.out.print("Le total à payer est de ");
        System.out.println(montantAchat);
    }
}
