package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice10 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez le montant: ");
        double montant = clavier.nextDouble();

        int tauxIntérêt = 2;
        int nbAnnée = 1;
        
        double intérêt = (montant * tauxIntérêt/100.) * nbAnnée;
        
        System.out.print("Les intérêts recus suite au dépôt d'un montant de ");
        System.out.print(montant);
        System.out.println(" euros après ");
        System.out.print(nbAnnée);
        System.out.print(" an sur un compte à un taux de ");
        System.out.print(tauxIntérêt);
        System.out.print("% sont de ");
        System.out.print(intérêt);
        System.out.println(" euro(s)");
    }
}
