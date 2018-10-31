package esi.dev1.td10;

/**
 * Exemples de méthodes retournant un tableau.
 * @author fservais
 */
public class TableauCopie {
    
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};
        afficherTab(tableau);
        int[] copie1 = copie(tableau);
        int[] copie2 = pasUneCopie(tableau);
        tableau[0] = 9;
        System.out.print("tableau: " );
        afficherTab(tableau);
        System.out.print("copie1: " );
        afficherTab(copie1);
        System.out.print("copie2: " );
        afficherTab(copie2);
    }
    
    static int[] copie(int[] tab) {
        int[] copie = new int[tab.length];
        for (int i = 0; i<tab.length; i++) {
           copie[i] = tab[i];
        }
        return copie;
    }
    static int[] pasUneCopie(int[] tab) {
        int[] copie = tab;
        return copie;
    }
    static void afficherTab(int[] tab) {
        for (int element : tab) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
