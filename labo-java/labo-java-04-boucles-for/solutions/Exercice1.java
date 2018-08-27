package g12345.dev1.td4;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre entier: ");
        int n = clavier.nextInt();
        
        System.out.println("les nombres de 1 à "+n);
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("les nombres pairs entre 1 et "+n);
        for (int i = 2; i <= n; i=i+2) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        System.out.println("les nombres de -"+n+" à "+n);
        for (int i = -n; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        System.out.println("les multiples de 5 compris entre 1 et "+n);
        for (int i = 5; i <= n; i += 5) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        System.out.println("les multiples de "+n+" compris entre 1 et 100");
        for (int i = n; i <= 100; i+=n) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
