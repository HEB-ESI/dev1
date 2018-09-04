package esi.dev1.td3;

import java.util.Scanner;

public class Exercice05 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez le premier nombre entier a\t: ");
        int a = clavier.nextInt();

        System.out.print("Entrez le second nombre entier b\t: ");
        int b = clavier.nextInt();

        System.out.print("Entrez le dernier nombre entier c\t: ");
        int c = clavier.nextInt();

        System.out.println("");
        
        System.out.print("a%2 == 0 \t\t\t\t");
        System.out.println(a % 2 == 0);

        System.out.print("a%2 == 1 \t\t\t\t");
        System.out.println(a % 2 == 1);

        System.out.print("a%b == 0 \t\t\t\t");
        System.out.println(a % b == 0);

        System.out.print("a < b \t\t\t\t\t");
        System.out.println(a < b);

        System.out.print("(a <= b) && (a <= c) \t\t\t");
        System.out.println((a <= b) && (a <= c));

        System.out.print("(a< b && b < c) || (a > b && b > c) \t");
        System.out.println((a < b && b < c) || (a > b && b > c));
    }
}
