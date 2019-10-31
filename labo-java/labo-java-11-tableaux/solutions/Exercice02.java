package esi.dev1.td10;

/**
 * Exemple d'utilisations des tableaux
 * <p>
 * @author dev1
 */
public class Exercice02 {

    /**
     * Exemple d'utilisations de tableaux d'entier.
     * <p>
     * @param args pas utilisé.
     */
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        System.out.println("taille: " + tab.length);
        System.out.println("1er élément: " + tab[0]);
        System.out.println("dernier élément: " + tab[tab.length - 1]);
        System.out.println("autre élément: " + tab[2]);
        System.out.println("affiche un drôle de truc: " + tab);

        afficherTab(tab);
        incrémenter(tab);
        afficherTab(tab);

        multiplier(tab, 42);
        afficherTab(tab);

        int[] tab2 = new int[10];
        afficherTab(tab2);
    }

    /**
     * Affiche un tableau.
     * <p>
     * @param tab le tableau à afficher
     */
    static void afficherTab(int[] tab) {
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
     * Incrémente chaque composante du tableau.
     * <p>
     * @param tab le tableau à incrémenter.
     */
    static void incrémenter(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }
    }

    /**
     * Multiplie chaque élément du tableau par la valeur donnée.
     * <p>
     * @param tab    le tableau à mettre à jour.
     * @param valeur la valeur mutltiplicatrice.
     */
    static void multiplier(int[] tab, int valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab[i] * valeur;
        }
    }
}
