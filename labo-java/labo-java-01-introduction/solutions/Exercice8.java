package g12345.dev1.td1;

import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez les valeurs de a et b:");
        int a = clavier.nextInt();
        int b = clavier.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*a+b*b);

    }
}
