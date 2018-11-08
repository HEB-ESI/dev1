package esi.dev1.td10;

/**
 * Exemple d'initialisation de tableaux de différents types.
 * <p>
 * @author dev1
 */
public class TestInit {

    /**
     * Exemple d'initialisation de tableaux de différents types.
     * <p>
     * @param args pas utilisé.
     */
    public static void main(String[] args) {
        int[] entiers = new int[10];
        Exercice02.afficherTab(entiers);

        double[] doubles = new double[10];
        afficherTab(doubles);

        boolean[] booléens = new boolean[10];
        afficherTab(booléens);

        String[] strings = new String[10];
        afficherTab(strings);
    }

    /**
     * Affiche un tableau de double.
     * <p>
     * @param tab le tableau à afficher
     */
    static void afficherTab(double[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ", ");

        }
        if (tab.length > 0) {
            System.out.print(tab[tab.length - 1]);
        }
        System.out.println("]"); // on passe à la ligne
    }

    /**
     * Affiche un tableau de booléens.
     * <p>
     * @param tab le tableau à afficher
     */
    static void afficherTab(boolean[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ", ");

        }
        if (tab.length > 0) {
            System.out.print(tab[tab.length - 1]);
        }
        System.out.println("]"); // on passe à la ligne
    }

    /**
     * Affiche un tableau de chaînes de caractères.
     * <p>
     * @param tab le tableau à afficher
     */
    static void afficherTab(String[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ", ");

        }
        if (tab.length > 0) {
            System.out.print(tab[tab.length - 1]);
        }
        System.out.println("]"); // on passe à la ligne
    }
}
