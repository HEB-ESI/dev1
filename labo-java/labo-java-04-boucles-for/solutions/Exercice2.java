package g12345.dev1.td4;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un mot");
        String mot = clavier.next();
        
        char première = mot.charAt(0);
        if(première =='a' || première == 'e' ||
           première =='i' || première == 'o' ||
           première =='u' || première =='y') {
            System.out.println("la première lettre est une voyelle");
        } else {
            System.out.println("la première lettre n'est pas une voyelle");
        }
    }
}
