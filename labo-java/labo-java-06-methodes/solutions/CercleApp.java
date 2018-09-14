package esi.dev1.td6;

import java.util.Scanner;

public class CercleApp {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez le rayon du cercle\t: ");
        double rayon = clavier.nextDouble();

        double périmètre = MathUtil.périmètreCercle(rayon);
        double aire = MathUtil.aireCercle(rayon);
        System.out.println("Le périmètre d’un cercle de rayon " + rayon + " est: " + périmètre);
        System.out.println("L'aire d’un cercle de rayon  " + rayon + "  est: " + aire);
    }
}
