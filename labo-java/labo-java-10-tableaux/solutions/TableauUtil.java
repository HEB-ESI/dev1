package esi.dev1.td10;

/**
 * Exemple de méthodes appliqués à des tableaux.
 * <p>
 * @author dev1
 */
public class TableauUtil {

    /**
     * Retourne le minimum
     * du tableau de double passé en paramètre.
     * <p>
     * @param tab tableau de double dont on cherche un minimum.
     * <p>
     * @return retourne le minimum
     * du tableau de double passé en paramètre.
     */
    static double min(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        double minimum = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (minimum > tab[i]) {
                minimum = tab[i];
            }
        }
        return minimum;
    }

    /**
     * Retourne le maximum
     * du tableau de double passé en paramètre.
     * <p>
     * @param tab tableau de double dont on cherche un maximum.
     * <p>
     * @return retourne le maximum
     * du tableau de double passé en paramètre.
     */
    static double max(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        double maximum = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (maximum < tab[i]) {
                maximum = tab[i];
            }
        }
        return maximum;
    }

    /**
     * Retourne la somme
     * des éléments d'un tableau de double.
     * <p>
     * @param tab tableau de double dont on somme les élements.
     * <p>
     * @return retourne la somme
     * du tableau de double passé en paramètre.
     */
    static double somme(double[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        double somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        return somme;
    }

    /**
     * Retourne la moyenne
     * des éléments d'un tableau de double.
     * <p>
     * @param tab tableau de double dont on moyenne les élements.
     * <p>
     * @return retourne la moyenne
     * du tableau de double passé en paramètre.
     */
    static double moyenne(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        return somme(tab) / tab.length;
    }

    /**
     * Retourne une copie d'un tableau de double.
     * <p>
     * @param tab tableau de double à copier.
     * <p>
     * @return retourne une copie
     * du tableau de double passé en paramètre.
     */
    static double[] copie(double[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        double[] copie = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            copie[i] = tab[i];
        }
        return copie;
    }

    /**
     * Retourne l'indice du premier maximum
     * du tableau de double passé en paramètre.
     * <p>
     * @param tab tableau de double dont on cherche un maximum.
     * <p>
     * @return retourne l'indice du premier maximum
     * du tableau de double passé en paramètre.
     */
    static int indiceMax(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        double maximum = tab[0];
        int indiceMax = 0;
        for (int i = 1; i < tab.length; i++) {
            if (maximum < tab[i]) {
                maximum = tab[i];
                indiceMax = i;
            }
        }
        return indiceMax;
    }

    /**
     * Vérifie si le
     * tableau de double passé en paramètre es trié dans m'ordre croissant.
     * <p>
     * @param tab tableau de double à vérifier.
     * <p>
     * @return retourne vrai si le tableau est trié dans l'ordre croissant.
     */
    static boolean estTrié(double[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        boolean estTrié = true;
        int i = 1;
        while (i < tab.length && estTrié) {
            estTrié = tab[i] > tab[i - 1];
            i++;
        }
        return estTrié;
    }

    /**
     * Retourne l'indice d'une valeur cherchée dans un
     * tableau de double passé en paramètre.
     * <p>
     * @param tab    tableau de double à parcourir.
     * <p>
     * @param valeur valeur cherchée au sein du tableau
     * <p>
     * @return retourne l'indice de la valeur cherchée au sein
     * du tableau de double passé en paramètre.
     */
    static int indice(int[] tab, int valeur) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        int indice = 0;
        boolean aTrouvé = false;
        int i = 0;
        while (i < tab.length && !aTrouvé) {
            if (valeur == tab[i]) {
                indice = i;
                aTrouvé = true;
            }
            i++;
        }
        if (!aTrouvé) {
            throw new IllegalArgumentException("La valeur " + valeur +
                                               " n'est pas dans le tableau");
        }
        return indice;
    }

    /**
     * Vérifie si le mot passé en paramètre est présent dans un
     * tableau passé en paramètre.
     * <p>
     * @param tab tableau de chaînes de caractères à parcourir.
     * <p>
     * @param mot mot cherché au sein du tableau
     * <p>
     * @return retourne vrai si le mot est présent dans le
     * tableau passé en paramètre.
     */
    static boolean contient(String[] tab, String mot) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        boolean contient = false;
        int i = 0;
        while (i < tab.length && !contient) {
            contient = tab[i].equals(mot);
            i++;
        }
        return contient;
    }

    /**
     * Vérifie si une valeur est présente dans un
     * tableau passé en paramètre.
     * <p>
     * Remarquez qu'un élément du tableau doit être proche de la valeur à
     * l'erreur près.
     * <p>
     * @param tab    tableau à parcourir.
     * <p>
     * @param valeur valeur cherchée au sein du tableau.
     * <p>
     * @param erreur marge d'erreur acceptée entre un élément du tableau et la
     *               valeur cherchée.
     * <p>
     * @return retourne vrai si un élément du tableau est proche de la valeur
     * à l'erreur près.
     */
    static boolean contient(double[] tab, double valeur,
                            double erreur) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        boolean contient = false;
        int i = 0;
        while (i < tab.length && !contient) {
            contient = Math.abs(tab[i] - valeur) <= erreur;
            i++;
        }
        return contient;

    }

    /**
     * Retourne vrai si le tableau possède des doublons
     * (2 fois la même valeur) et faux sinon.
     * <p>
     * @param tab tableau à vérifier.
     * <p>
     * @return retourne vrai si le tableau possède des doublons
     * (2 fois la même valeur) et faux sinon.
     */
    static boolean doublons(int[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        boolean aDoublons = false;
        int i = 0;
        while (i < tab.length && !aDoublons) {
            int j = 0;
            while (j < tab.length && !aDoublons) {
                aDoublons = (tab[i] == tab[j] && i != j);
                j++;
            }
            i++;
        }
        return aDoublons;
    }

    /**
     * Retourne le nombre d'éléments négatifs du tableau.
     * <p>
     * @param tab tableau à vérifier.
     * <p>
     * @return le nombre d'éléments négatifs du tableau.
     */
    static int nbNégatifs(double[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        int nbNegatifs = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                nbNegatifs++;
            }
        }
        return nbNegatifs;
    }

    /**
     * Echange la valeur se trouvant à l'indice indice1
     * avec la valeur se trouvant à l'indice indice2 d'un tableau passé en
     * paramètre.
     * <p>
     * @param tab     tableau dont on change la place de certains éléments.
     * @param indice1 indice du premier élément à déplacer.
     * @param indice2 indice du second élément à déplacer.
     */
    static void échange(double[] tab, int indice1, int indice2) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        if (tab.length <= indice1) {
            throw new IllegalArgumentException("Le tableau ne contient pas autant d'élément " +
                                               indice1);
        }
        if (tab.length <= indice2) {
            throw new IllegalArgumentException("Le tableau ne contient pas autant d'élément " +
                                               indice2);
        }
        if (indice1 < 0 || indice2 < 0) {
            throw new IllegalArgumentException("Indice négatif interdit " +
                                               indice1 + " " +
                                               indice2);
        }
        double temp = tab[indice1];
        tab[indice1] = tab[indice2];
        tab[indice2] = temp;
    }

    /**
     * Inverse l'ordre des éléments du tableau passé en paramètre.
     * <p>
     * @param tab tableau dont on change la place de certains éléments.
     */
    static void inverser(double[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        for (int i = 0; i < tab.length / 2; i++) {
            échange(tab, i, tab.length - 1 - i);
        }
    }

    /**
     * Retourne un tableau contenant les indices des minimums.
     * Le nombre d'élements du tableau retourné est le nombre de minimum présent
     * dans le tableau initial (et non la taille du tableau initial).
     * <p>
     * @param tab tableau de double dont on cherche les minimums.
     * <p>
     * @return un tableau contenant les indices des minimums.
     */
    static int[] indicesMin(double[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        double minValue = tab[0];

        int[] indices = new int[tab.length];
        indices[0] = 0;
        int j = 1;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] <= minValue) {
                if (tab[i] < minValue) {
                    minValue = tab[i];
                    j = 0;
                }
                indices[j] = i;
                j++;
            }
        }
        return reduction(j, indices);
    }

    /**
     * Retourne une partie du tableau donné en paramètre.
     * Si un tableau de taille 10 est donné en paramètre et que la taille
     * du tableau de sortie est de 4, le tableau de sortie a une taille de 4
     * et contiend les 4 premiers éléments du tableau.
     * <p>
     * @param taille taille du tableau de sortie.
     * <p>
     * @param tab tableau à racourcir.
     * <p>
     * @return retourne une partie du tableau donné en paramètre.
     */
    private static int[] reduction(int taille, int[] tab) {
        int[] réduit = new int[taille];
        for (int i = 0; i < taille; i++) {
            réduit[i] = tab[i];
        }
        return réduit;
    }

}
