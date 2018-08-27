package g12345.dev1.td4;

import java.util.Scanner;

public class Exercice6 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un mot");
        String mot = clavier.next();

        for (int i = 0; i < mot.length(); i++) {
            char lettre = mot.charAt(i);
            if (lettre == 'a' || lettre == 'e'
                    || lettre == 'i' || lettre == 'o'
                    || lettre == 'u' || lettre == 'y') {
                System.out.print(lettre);
            }
        }
        System.out.println(); // on passe à la ligne
    }
}
