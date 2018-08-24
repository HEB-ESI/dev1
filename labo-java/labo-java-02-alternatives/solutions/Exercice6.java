package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre entier: ");
        int nb = clavier.nextInt();
        
        if(nb%2==0) {
            System.out.println("ce nombre est pair");
        } else {
            System.out.println("ce nombre est impair");
        }
    }
}
