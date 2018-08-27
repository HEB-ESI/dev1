package g12345.dev1.td4;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un mot");
        String mot = clavier.next();
        
        char première = mot.charAt(0);
        char dernière = mot.charAt(mot.length()-1);
        if(première == dernière) {
            System.out.println("la première et la dernière lettre sont égales");
        } else {
            System.out.println("la première et la dernière "+
                    "lettre ne sont pas égales");
        }
    }
}
