package g12345.dev1.td4;

import java.util.Scanner;

public class Exercice5 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un mot");
        String mot = clavier.next();

        for (int i = mot.length() - 1; i >= 0; i--) {
            System.out.print(mot.charAt(i));
        }
        System.out.println(); // on passe à la ligne
    }
}
