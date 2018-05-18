package esi.dev1.td1;

import java.util.Scanner;

public class AireRectangle {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la longueur du rectangle: ");
        int longueur = clavier.nextInt();
        
        System.out.println("Entrez la largeur du rectangle: ");
        int largeur = clavier.nextInt();
        
        System.out.println("L'aire du rectangle vaut: ");
        System.out.println(largeur*longueur);
    }
}