package g12345.dev1.td2;

import java.util.Scanner;


public class Exercice4 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez les valeurs de a ,b et c:");
        int a = clavier.nextInt();
        int b = clavier.nextInt();
        int c = clavier.nextInt();
        
        System.out.println(a%2==0);
        System.out.println(a%2==1);
        System.out.println(a%b==0);
        System.out.println(a<b);
        System.out.println((a<=b) && (a<=c));
        System.out.println( (a<b && b<c) || (a>b && b>c));
    }
}
