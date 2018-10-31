package esi.dev1.td10;

/**
 * Exemple d'utilisations des tableaux
 * @author fservais
 */
public class Tableau {

    /**
     * Exemple d'utilisations de tableaux d'entier.
     * @param args pas utilisé.
     */
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        System.out.println("taille: "+tab.length);
        System.out.println("1er élément: "+tab[0]);
        System.out.println("dernier élément: "+tab[tab.length-1]);
        System.out.println("autre élément: "+tab[2]);
        System.out.println("affiche un drôle de truc: "+tab);
        
        afficherTab(tab);
        incrémenter(tab);
        afficherTab(tab);
        
        int[] tab2 = new int[10];
        afficherTab(tab2);
    }
    
    /**
     * Affiche un tableau.
     * @param tab le tableau à afficher
     */
    static void afficherTab(int[] tab) {
        for (int valeur : tab) {
            System.out.print(valeur+" ");
        }
        System.out.println(); // on passe à la ligne
    }

    /**
     * Incrémente chaque composante du tableau.
     * @param tab le tableau à incrémenter.
     */
    static void incrémenter(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }
    }
}
