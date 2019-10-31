package esi.dev1.td10;

/**
 * Exemples de méthodes retournant un tableau.
 * <p>
 * @author dev1
 */
public class Exercice05 {

    /**
     * Exemple d'utilisations de méthodes retournant des tableaux.
     * <p>
     * @param args pas utilisé.
     */
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};
        afficherTab(tableau);
        int[] copie1 = copie(tableau);
        int[] copie2 = pasUneCopie(tableau);
        tableau[0] = 9;
        System.out.print("tableau: ");
        afficherTab(tableau);
        System.out.print("copie1: ");
        afficherTab(copie1);
        System.out.print("copie2: ");
        afficherTab(copie2);
        System.out.print("miroir: ");
        int[] miroir = miroir(tableau);
        afficherTab(miroir);
    }

    /**
     * Retourne une copie d'un tableau d'entiers.
     * <p>
     * @param tab le tableau à copier.
     * <p>
     * @return une copie du tableau donné en paramètre.
     */
    static int[] copie(int[] tab) {
        int[] copie = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            copie[i] = tab[i];
        }
        return copie;
    }

    /**
     * Retourne le tableau d'entiers passé en paramètre.
     * Aucune modification n'est effectuée dans le tableau.
     * <p>
     * @param tab le tableau à retourner.
     * <p>
     * @return le tableau d'entiers passé en paramètre.
     */
    static int[] pasUneCopie(int[] tab) {
        int[] copie = tab;
        return copie;
    }

    /**
     * Affiche un tableau d'entiers.
     * <p>
     * @param tab le tableau à afficher
     */
    static void afficherTab(int[] tab) {
        for (int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Retourne un nouveau tableau dont les éléments sont les
     * éléments du tableau reçu en paramètre mais en ordre inverse.
     * Par exemple si le tableau est celui de l'exemple la méthode
     * retourne un tableau contenant les entiers 5, 4, 3, 2, 1.
     * <p>
     * @param tab le tableau à inverser.
     * <p>
     * @return un nouveau tableau dont les éléments sont les
     * éléments du tableau reçu en paramètre mais en ordre inverse.
     */
    static int[] miroir(int[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        int[] miroir = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            miroir[tab.length - 1 - i] = tab[i];
        }
        return miroir;
    }
}
