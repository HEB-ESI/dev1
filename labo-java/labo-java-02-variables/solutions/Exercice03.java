package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice03 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la longueur d'un coté du carré: ");
        int longeur = clavier.nextInt();

        System.out.println("L’aire du carré vaut: ");
        System.out.println(longeur * longeur);
    }
}
