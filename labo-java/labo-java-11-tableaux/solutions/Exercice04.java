package esi.dev1.td10;

/**
 * Exemple d'utilisation de tableaux de chaines.
 * <p>
 * @author dev1
 */
public class Exercice04 {

    /**
     * Exemple d'utilisations de tableaux de chaînes de caractères.
     * <p>
     * @param args pas utilisé.
     */
    public static void main(String[] args) {
        String[] mots = {"the", "quick", "brown", "fox", "jumps", "over", "the",
                         "lazy", "dog"};

        for (String mot : mots) { // pour chaque mot dans le tableau 'mots'
            System.out.print(mot + " "); // affiche le mot suivi d'un espace.
        }
        System.out.println(); // passe à la ligne.
        afficheTableau(mots); // la même chose mais dans une méthode.

        afficherTailles(mots);

        String plusLongMot = plusLongMot(mots);
        System.out.println("Un des mots le plus longs est " + plusLongMot);
    }

    /**
     * Affiche un tableau de chaînes de caractères.
     * <p>
     * @param mots le tableau à afficher.
     */
    static void afficheTableau(String[] mots) {
        for (String mot : mots) {
            System.out.print(mot + " ");
        }
        System.out.println();
    }

    /**
     * Affiche les tailles des éléments d'un tableau de chaînes de caractères.
     * <p>
     * @param tab le tableau dont on analyse les éléments.
     */
    static void afficherTailles(String[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        for (String mot : tab) {
            System.out.print(mot.length() + " ");
        }
        System.out.println("");
    }

    /**
     * Retourne le mot le plus longs contenu dans un tableau de chaînes de
     * caractères.
     * <p>
     * @param tab le tableau de chaînes de caractères.
     * <p>
     * @return le mot le plus longs contenu dans le tableau.
     */
    static String plusLongMot(String[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        String plusLongMot = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (plusLongMot.length() < tab[i].length()) {
                plusLongMot = tab[i];
            }
        }
        return plusLongMot;
    }
}
