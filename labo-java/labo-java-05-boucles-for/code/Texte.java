package esi.dev1.td5;

import java.util.Scanner;

public class Texte {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String texte = clavier.nextLine(); //lit du texte au clavier 
        
        System.out.println(texte);
        System.out.println("Le texte entré est: "+texte);
        
        int longueur = texte.length(); //le nombre de caractères
        System.out.println("La longueur du texte est: "+longueur); 
        
        char premièreLettre = texte.charAt(0);
        char dernièreLettre = texte.charAt(longueur-1);
        System.out.println(premièreLettre);
        System.out.println(dernièreLettre);
        
        
        for(int i=0; i< texte.length(); i=i+1) { // parcours la chaine de caractères
            System.out.print(texte.charAt(i));
        }
        
        System.out.println(); //passe à la ligne
        
        for(int i=texte.length()-1; i>=0; i=i-1) { // parcours la chaine de caractères à l'envers
            System.out.print(texte.charAt(i));
        }
    }
}
