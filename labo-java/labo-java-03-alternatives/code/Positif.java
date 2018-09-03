package esi.dev1.td3;

import java.util.Scanner;

public class Positif {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.print("Entrez un nombre entier: ");
        int nb = clavier.nextInt();
        
        if(nb>=0) {
            System.out.print("ce nombre est positif.");
        }
    }
}
