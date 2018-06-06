package esi.dev1.td2;

import java.util.Scanner;

public class Calculs {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        int x = clavier.nextInt();
        double y = clavier.nextDouble();
        
        System.out.println(12.3 + 13.5);
        System.out.println(x * 3.1415);
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x*x + y*y);
    }
}
