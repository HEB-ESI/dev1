package esi.dev1.td2;

import java.util.Scanner;

public class AireCercle {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la rayon du cercle: ");
        double rayon = clavier.nextDouble();
        double PI = 3.141596;
        
        System.out.println("L'aire du cercle vaut: ");
        System.out.println(PI*rayon*rayon);
    }
}