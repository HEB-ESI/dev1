package g12345.dev1.td3;

import java.util.Scanner;


public class Exercice2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez la lognueur de la ligne: ");        
        int longueur = clavier.nextInt();
        
        while(longueur>0) {
            System.out.print("-");
            longueur = longueur - 1;
        }
        System.out.println(); // on passe à la ligne
    }
}
