package g12345.dev1.td5;

import java.util.Scanner;

public class CercleApp {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le rayon du cercle: ");
        
        double rayon = clavier.nextDouble();
        
        System.out.println("le périmètre: "+MathUtil.périmètreCercle(rayon));
        System.out.println("l'aire: "+MathUtil.aireCercle(rayon));
    }
}
