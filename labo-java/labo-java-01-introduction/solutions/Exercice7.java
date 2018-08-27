package g12345.dev1.td1;

import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le coté du carré: ");
        int coté = clavier.nextInt();
        System.out.println("L'aire du carré vaut: "+coté*coté);
    }
}
