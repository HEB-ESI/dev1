package g12345.dev1.td3;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre entier: ");
        int n = clavier.nextInt();
        int i;
        
        System.out.println("les nombres de 1 à "+n);
        i = 1;
        while(i<=n) {
            System.out.println(i);
            i = i+1;
        }

        System.out.println("les nombres pairs entre 1 et "+n);
        i = 2;
        while(i<=n) {
            System.out.println(i);
            i = i+2;
        }
        
        System.out.println("les nombres de -"+n+" à "+n);
        i = -n;
        while(i<=n) {
            System.out.println(i);
            i = i+1;
        }
        
        System.out.println("les multiples de 5 compris entre 1 et "+n);
        i = 5; 
        while(i<=n) {
            System.out.println(i);
            i = i+5;
        }
        
        System.out.println("les multiples de "+n+" compris entre 1 et 100");
        i = n;
        while(i<=100) {
            System.out.println(i);
            i = i+n;
        }

    }
}
