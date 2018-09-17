package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice05 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la valeur du premier nombre entier: ");
        int a = clavier.nextInt();

        System.out.println("Entrez la valeur du second nombre entier: ");
        int b = clavier.nextInt();

        System.out.print("a + b = ");
        System.out.println(a + b);

        System.out.print("a - b = ");
        System.out.println(a - b);

        System.out.print("a * b = ");
        System.out.println(a * b);

        System.out.print("a / b = ");
        System.out.println(a / b);

        System.out.print("a % b = ");
        System.out.println(a % b);

        System.out.print("a * a + b * b = ");
        System.out.println(a * a + b * b);
    }
}
