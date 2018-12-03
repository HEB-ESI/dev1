package g12345.dev1.lemotlepluslong;

import esi.dev1.util.Dictionnaire;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Le mot le plus long est un jeu de lettres à deux joueurs qui se déroule en
 * plusieurs manches. Le nombre de manches est choisi au départ, par exemple 5
 * manches. Une manche se déroule en 2 étapes. Tout d’abord les joueurs, chacun
 * à leur tour, tirent au hasard soit une voyelle, soit une consonne (le score
 * choisit), jusqu’à obtenir 9 lettres. A chaque fois qu’une lettre est tirée
 * (voyelle ou consonne), la lettre est dévoilée aux joueurs afin qu’ils
 * puissent continuer en connaissance de cause.Ensuite les joueurs cherchent le
 * mot le plus long avec les lettres disponibles. Chaque score annonce la
 * longueur du mot trouvé. Celui qui a trouvé le mot le plus long le forme avec
 * les lettres disponibles. On vérifie alors que c’est bien un mot du
 * dictionnaire. Le score gagne autant de points que le nombre de lettres de son
 * mot.
 *
 * @author esiProf
 */
public class LeMotLePlusLong {

    /**
     * Point d'entrée de l'application permettant d’afficher sur le terminal le
     * jeu du Mot le plus long.
     *
     * @param args aucun argument en ligne de commande n'est attendu.
     */
    public static void main(String[] args) {
        int nbManches = 3;
        int joueurs[] = new int[2];
        System.out.println("> > > Début de la patie");
        for (int numéroManche = 0; numéroManche < nbManches; numéroManche++) {
            jouerManche(numéroManche, joueurs);
        }
        System.out.println("> > > Fin de la partie");
        System.out.println("");
        afficherScore(joueurs);
        afficherVainqueur(joueurs);
    }

    /**
     * Retourne une voyelle tirée au hasard ('A', 'E', 'I', 'O', 'U', 'Y').
     *
     * @return une voyelle tirée au hasard.
     */
    static char tirerVoyelle() {
        char[] voyelles = {'A', 'E', 'I', 'O', 'U', 'Y'};
        int[] occurences = {67_563_628, 115_024_205, 62_672_992,
            47_724_400, 42_698_875, 4_351_953};
        double[] frequences = calculFrequence(occurences);
        int indice = tirageFrequentiel(frequences, Math.random());
        return voyelles[indice];
    }

    /**
     * Retourne une voyelle tirée au hasard ('B', 'C', 'D', 'F', 'G',
     * 'H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Z').
     *
     * @return une voyelle tirée au hasard.
     */
    static char tirerConsonne() {
        char[] consonnes = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
            'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'};
        int[] occurences = {10_817_171, 30_219_574, 34_914_685, 10_579_192,
            11_684_140, 10_583_562, 3_276_064, 2_747_547, 47_171_247, 24_894_034,
            60_728_196, 23_647_179, 6_140_307, 57_656_209, 61_882_785,
            56_267_109, 10_590_858, 1_653_435, 3_588_990, 1_433_913
        };
        double[] frequences = calculFrequence(occurences);
        int indice = tirageFrequentiel(frequences, Math.random());
        return consonnes[indice];
    }

    /**
     * Affiche affiche le contenu du tableau de caractère lettres.
     *
     * @param lettres contenu du tableau de caractère à afficher.
     */
    static void afficherLettres(char[] lettres) {
        if (lettres == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        System.out.print("> > > Lettres tirées : ");
        for (char lettre : lettres) {
            System.out.print(lettre + " ");
        }
        System.out.println("");
    }

    /**
     * Demande à l’utilisateur s’il veut une voyelle ou une consonne et en
     * fonction de la réponse de la réponse tire une voyelle ou une consonne. La
     * méthode affiche les lettres déjà tirées et répète la demande et le tirage
     * 9 fois. La méthode retourne un tableau de 9 caractères contenant les
     * lettres tirées.
     *
     * @return un tableau de 9 caractères contenant les lettres tirées.
     */
    static char[] demanderLettres() {
        char[] lettres = new char[9];
        Scanner clavier = new Scanner(System.in);
        for (int indice = 0; indice < lettres.length; indice++) {
            afficherLettres(lettres);
            System.out.println("> > > Tirez une consonne (o) ?");
            boolean consonne = clavier.next().charAt(0) == 'o';
            char lettre;
            if (consonne) {
                lettre = tirerConsonne();
            } else {
                lettre = tirerVoyelle();
            }
            lettres[indice] = lettre;
        }
        afficherLettres(lettres);
        return lettres;
    }

    /**
     * Demande à l’utilisateur le mot le plus long qu’il a trouvé.
     *
     * @return le mot donné par l’utilisateur.
     */
    static String demanderMot() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("> > > Entrez le mot le plus long que vous "
                + "avez trouvé");
        return clavier.nextLine().toUpperCase();
    }

    /**
     * Vérifie que le mot proposé est possible avec les lettres disponibles.
     *
     * @param lettres lettres disponibles.
     * @param mot mot proposé.
     * @return true si le mot proposé est possible avec les lettres disponibles
     * et faux sinon.
     */
    static boolean vérifierLettres(char[] lettres, String mot) {
        if (lettres == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        if (mot == null) {
            throw new IllegalArgumentException("Le mot est null");
        }
        boolean estValide = true;
        int indiceMot = 0;
        char[] temp = copierTab(lettres);
        while (estValide && indiceMot < mot.length()) {
            char lettre = mot.charAt(indiceMot);
            estValide = estDans(lettre, temp);
            indiceMot++;
        }
        return estValide;
    }

    /**
     * Vérifie que le mot proposé se trouve dans le dictionnaire.
     *
     * @param mot mot dont il faut vérifier la présence dans le dictionnaire.
     * @return true si le mot est dans le dictionnaire et faux sinon.
     */
    static boolean dansDictionnaire(String mot) {
        if (mot == null) {
            throw new IllegalArgumentException("Le mot est null");
        }
        String[] dico = Dictionnaire.mots();
        boolean trouvé = false;
        int indice = 0;
        while (!trouvé && indice < dico.length) {
            trouvé = (mot.equals(dico[indice]));
            indice++;
        }
        return trouvé;
    }

    /**
     * Parcourt le dictionnaire à la recherche du mot le plus long faisable avec
     * les lettres disponibles. Si plusieurs motsTrouvés sont possible on en
     * choisit ici un seul.
     *
     * @param lettres lettres disponibles pour composer le mot le plus long.
     * @return mot le plus long faisable avec les lettres disponibles.
     */
    static String meilleurMot(char[] lettres) {
        if (lettres == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        String[] dico = Dictionnaire.mots();
        String mot = "";
        int indice = 0;
        while (indice < dico.length) {
            boolean trouvé = vérifierLettres(lettres, dico[indice]);
            if (trouvé && mot.length() < dico[indice].length()) {
                mot = dico[indice];
            }
            indice++;
        }
        return mot;
    }

    /**
     * Retourne la liste de tous les motsTrouvés les plus longs du dictionnaire
     * faisable avec les lettres disponibles.
     *
     * @param lettres lettres disponibles pour composer le mot le plus long.
     * @return la liste de tous les motsTrouvés les plus longs du dictionnaire
     * faisable avec les lettres disponibles.
     */
    static String[] meilleursMots(char[] lettres) {
        if (lettres == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        String[] dico = Dictionnaire.mots();
        String[] motsTrouvés = new String[dico.length];
        int nbMotsTrouvés = 0;
        int indiceDico = 0;
        int tailleMot = 0;
        while (indiceDico < dico.length) {
            boolean trouvé = vérifierLettres(lettres, dico[indiceDico]);
            if (trouvé && tailleMot <= dico[indiceDico].length()) {
                if (tailleMot < dico[indiceDico].length()) {
                    nbMotsTrouvés = 0;
                    tailleMot = dico[indiceDico].length();
                }
                motsTrouvés[nbMotsTrouvés] = dico[indiceDico];
                nbMotsTrouvés++;
            }
            indiceDico++;
        }
        return reduction(nbMotsTrouvés, motsTrouvés);
    }

    /**
     * Affiche le ou les vaiqueurs.
     *
     * @param joueurs tableau contenant les scores des 2 joueurs.
     */
    private static void afficherVainqueur(int[] joueurs) {
        if (joueurs == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        if (joueurs[0] == joueurs[1]) {
            System.out.println("> > > Bravo joueur 1 et joueur 2");
        } else if (joueurs[0] < joueurs[1]) {
            System.out.println("> > > Bravo joueur 2");
        } else {
            System.out.println("> > > Bravo joueur 1");
        }
    }

    /**
     * Affiche le score des joueurs.
     *
     * @param joueurs tableau contenant les scores des 2 joueurs.
     */
    private static void afficherScore(int[] joueurs) {
        if (joueurs == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        for (int numéroJoueur = 0; numéroJoueur < joueurs.length; numéroJoueur++) {
            System.out.println("> > > Score du joueur " + numéroJoueur + " : "
                    + joueurs[numéroJoueur]);
        }
    }

    /**
     * Affiche une liste de mots.
     *
     * @param mots les mots à afficher.
     */
    private static void afficherMots(String[] mots) {
        if (mots == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        if (mots.length == 0) {
            System.out.println("> > > Aucun mot possible à afficher");
        } else {
            System.out.println("> > > Les " + mots.length + " meilleurs mots "
                    + "sont : ");
            for (int indice = 0; indice < mots.length; indice++) {
                System.out.print("\t " + mots[indice]);
                if ((indice + 1) % 5 == 0) {
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }

    /**
     * Permet aux deux joueurs de joueur une manche du mot le plus long.
     *
     * @param numéroManche numéro de la manche à joueur.
     * @param score des deux joueurs à mettre à jour.
     *
     */
    private static void jouerManche(int numéroManche, int[] joueurs) {
        System.out.println("----- Début de la manche " + (numéroManche + 1));
        char[] lettres = demanderLettres();
        String[] meilleursMots = meilleursMots(lettres);
        if (meilleursMots.length == 0) {
            System.out.println("> > > Aucun mot n'est possible avec ces lettres "
                    + Arrays.toString(lettres));
        } else {
            for (int numéroJoueur = 0; numéroJoueur < joueurs.length; numéroJoueur++) {
                System.out.println("> > > A votre tour joueur " + (numéroJoueur + 1));
                joueurs[numéroJoueur] += jouerUnCoup(lettres);
            }
            afficherMots(meilleursMots);
        }
        System.out.println("----- Fin de la manche " + (numéroManche + 1));
        afficherScore(joueurs);
        System.out.println("");
    }

    /**
     * Permet à un joueur de proposer un mot avec les lettres tirées au hasard.
     * Si le mot proposé n'est pas possible avec les lettres tirées ou si le mot
     * n'est pas dans le dictionaire, le score doit faire une nouvelle
     * proposition. La méthode retourne le score du mot. Le score est la
     * longueur du mot.
     *
     * @param lettres lettres tirées au hasard.
     * @return le score associé au mot, sa longueur.
     */
    private static int jouerUnCoup(char[] lettres) {
        if (lettres == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        boolean estValide = false;
        boolean existe = false;
        String mot = "";
        while (!estValide || !existe) {
            mot = demanderMot();
            estValide = vérifierLettres(lettres, mot);
            if (!estValide) {
                System.out.println("> > > Le mot proposé n'est pas possible "
                        + "avec les lettres tirées.");
            }
            existe = dansDictionnaire(mot);
            if (!existe) {
                System.out.println("> > > Le mot proposé n'est pas dans "
                        + "le dictionnaire.");
            }
        }
        return mot.length();
    }

    /**
     * Copie un tableau de caractères.
     *
     * @param lettres tableau à copier.
     * @return une copie du tableau.
     */
    private static char[] copierTab(char[] lettres) {
        if (lettres == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        char[] copie = new char[lettres.length];
        for (int indice = 0; indice < lettres.length; indice++) {
            copie[indice] = lettres[indice];
        }
        return copie;
    }

    /**
     * Vérifie si le caractère est présent dans le tableau. Attention si le
     * caractère est présent, sa première apparition est remplacée dans le
     * tableau par le caractère espace. Le test est effectué sans tenir compte
     * de casse, un s minuscule est équivalent à un S majuscule.
     *
     * @param lettre caractère recherché.
     * @param tab tableau de caractères à fouiller.
     * @return true si le caractère est présent dans le tableau et faux sinon.
     */
    private static boolean estDans(char lettre, char[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        boolean estDans = false;
        int indice = 0;
        while (!estDans && indice < tab.length) {
            if (Character.toUpperCase(lettre) == Character.toUpperCase(tab[indice])) {
                tab[indice] = ' ';
                estDans = true;
            }
            indice++;
        }
        return estDans;
    }

    /**
     * Retourne une partie du tableau donné en paramètre. Si un tableau de
     * tailleMot 10 est donné en paramètre et que la tailleMot du tableau de
     * sortie est de 4, le tableau de sortie a une tailleMot de 4 et contiend
     * les 4 premiers éléments du tableau.
     * <p>
     * @param taille tailleMot du tableau de sortie.
     * <p>
     * @param tab tableau à racourcir.
     * <p>
     * @return retourne une partie du tableau donné en paramètre.
     */
    private static String[] reduction(int taille, String[] tab) {
        if (tab == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        String[] réduit = new String[taille];
        for (int i = 0; i < taille; i++) {
            réduit[i] = tab[i];
        }
        return réduit;
    }

    /**
     * Retourne un tableau contenant les fréquences cumulatives de chaque
     * lettre.
     *
     * @param occurences nombre d'occurence des lettres dans une langue donnée.
     * @return un tableau contenant les fréquences cumulatives de chaque lettre.
     */
    static double[] calculFrequence(int[] occurences) {
        if (occurences == null) {
            throw new IllegalArgumentException("Le tableau est null");
        }
        double[] frequence = new double[occurences.length];
        double somme = 0;
        for (int occurence : occurences) {
            somme += occurence;
        }
        double precedent = 0;
        for (int indice = 0; indice < occurences.length; indice++) {
            frequence[indice] = precedent + occurences[indice] / somme;
            precedent = frequence[indice];
        }
        return frequence;
    }

    /**
     * Retourne l'indice de la lettre tirée au hasard en respectant la fréquence
     * d'appartion de chaque lettre. Prendre le nombre aléatoire en apramètre
     * permet de tester la méthode via des tests unitaires.
     *
     * @param frequences tableau de fréquences des lettres.
     * @param nombre nombre aléatoire à comparer aux fréquences
     * @return l'indice de la lettre tirée au hasard en respectant la fréquence
     * d'appartion de chaque lettre.
     */
    static int tirageFrequentiel(double[] frequences, double nombre) {
        if (frequences == null || frequences.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide ou null");
        }
        boolean trouvé = false;
        int indice = 0;
        while (!trouvé && indice < frequences.length) {
            trouvé = nombre < frequences[indice];
            indice++;
        }
        return indice - 1;
    }
}
