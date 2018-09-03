package esi.dev1.td6;

public class Ligne {

    static void afficherLigne(int longueur) {
        for(int i=0; i<longueur; i++) {
            System.out.print('-');
        }
        System.out.println(); //on passe à la ligne.
        
    }
    
    public static void main(String[] args) {
        afficherLigne(10);
        afficherLigne(20);
    }
}