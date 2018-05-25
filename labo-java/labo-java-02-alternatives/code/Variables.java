package esi.dev1.td2;

public class Variables {

    public static void main(String[] args) {
        String nom = "John"; // déclare une variable de type texte, assigne la valeur "John"
        double taille = 1.92;  // déclare une variable de type réel, assigne la valeur 1.92
        int année = 1958;		
        
        System.out.print("Bonjour"); // affiche le texte entre guillemet: Bonjour
        System.out.println(nom); // affiche la valeur de la variable nom: John

        System.out.print("Vous mesurez: ");
        System.out.print(taille); // affiche la valeur de la variable taille: 1.92
        System.out.println(" mètres");
        
        System.out.print("Vous avez: ");
        System.out.print(2018-année); // affiche la valeur de l'expression 2018-année: 60
        System.out.println(" ans");
    }
}
