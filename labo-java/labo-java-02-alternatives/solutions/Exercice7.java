package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez 2 nombres: ");
        double x = clavier.nextDouble();
        double y = clavier.nextDouble();
        if(x<y) {
            System.out.println(y);
        } else {
            System.out.println(x);
        }
    }
}
