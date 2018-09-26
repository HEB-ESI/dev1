package g12345.dev1.calendrier;

/**
 * Petite application permettant d’afficher sur le terminal le calendrier d’un
 * mois et d’une année données.
 *
 * Votre programme demandera à l’utilisateur d’entrer au clavier un mois et une
 * année au format MM (ou M) AAAA (par exemple 6 2018 ou 12 2015) et afficher le
 * calendrier de ce mois.
 *
 * @author profEsi
 */
public class Calendrier {

    /**
     * Cette méthode reçoit le numéro d’un mois et retourne son nom en français.
     *
     * Par exemple si la méthode reçoit 1 elle retourne "Janvier" et si elle
     * reçoit 6 elle retourne "Juin".
     *
     * @param mois numéro du mois au format M ou MM.
     * @return le nom du mois en français.
     */
    public static String nomMois(int mois) {
        String nom;
        switch (mois) {
            case 1:
                nom = "Janvier";
                break;
            case 2:
                nom = "Février";
                break;
            case 3:
                nom = "Mars";
                break;
            case 4:
                nom = "Avril";
                break;
            case 5:
                nom = "Mai";
                break;
            case 6:
                nom = "Juin";
                break;
            case 7:
                nom = "Juillet";
                break;
            case 8:
                nom = "Août";
                break;
            case 9:
                nom = "Septembre";
                break;
            case 10:
                nom = "Octobre";
                break;
            case 11:
                nom = "Novembre";
                break;
            case 12:
                nom = "Décembre";
                break;
            default:
                throw new IllegalArgumentException("Numéro du mois impossible " + mois);
        }
        return nom;
    }

    /**
     * Méthode qui reçoit un mois et une année et affiche le titre.
     *
     * @param mois numéro du mois au format M ou MM.
     * @param année année au format AAAA.
     */
    public static void afficherTitre(int mois, int année) {
        if (mois < 1 || mois > 12) {
            throw new IllegalArgumentException("Numéro du mois incohérent " + mois);
        }
        System.out.println("================================");
        System.out.println("           " + nomMois(mois) + " " + année);
        System.out.println("================================");

    }

    /**
     * Méthode qui affiche l’entête du calendrier avec les noms des jours de la
     * semaine.
     */
    public static void afficherEntête() {
        System.out.println("Lu   Ma   Me   Je   Ve   Sa   Di");
    }

    /**
     * Méthode qui reçoit le décalage de départ et le nombre de jours dans le
     * mois et affiche les numéros de jours du mois en prenant soin de faire les
     * sauts de ligne opportuns.
     *
     * Si le décalage de départ est de 4, le nombre de décalage représenté par "
     * " sera copier 4 fois.
     *
     * @param décalage décalapge de départ pour l'affichage du calendrier.
     * @param nombreJours nombre de jours dans un mois.
     */
    public static void afficherMois(int décalage, int nombreJours) {
        if (décalage < 0 || décalage > 6) {
            throw new IllegalArgumentException("Décallage impossible " + décalage);
        }
        if (nombreJours < 1 || nombreJours > 31) {
            throw new IllegalArgumentException("Nombre de jour incohérent " + nombreJours);
        }
        for (int i = 0; i < décalage; i++) {
            System.out.print("     ");
        }

        for (int jour = 1; jour <= nombreJours; jour++) {
            if (jour < 10) {
                System.out.print("0" + jour + "   ");
            } else {
                System.out.print(jour + "   ");
            }
            if ((jour + décalage) % 7 == 0) {
                System.out.println("");
            }
        }
        System.out.println();
    }

    /**
     * Méthode qui qui reçoit une année en paramètre et retourne vrai si cette
     * année est une année bissextile et faux sinon.
     *
     * Par exemple, les années 2000 (car divisible par 400) et 2008 (car
     * divisible par 4 mais pas par 100) sont bissextiles. Par contre, les
     * années 1900, 2018 ou encore 2003 ne le sont pas.
     *
     * @param année numéro de l'année au format AAAA.
     * @return vrai si cette année est une année bissextile et faux sinon.
     */
    public static boolean estBissextile(int année) {
        return (((année % 4) == 0) && ((année % 100 != 0) || (année % 400 == 0)));
    }

    /**
     * Mérhode qui reçoit un mois et une année et retourne le nombre de jours
     * dans ce mois.
     *
     * Par exemple si le méthode reçoit 1 et 2018 elle retourne 31 car le mois
     * de janvier a toujours 31 jours. Si elle reçoit 2 et 2018 elle retourne 28
     * car février 2018 a 28 jours puisque l’année 2018 n’est pas bissextile.
     *
     * @param mois numéro du mis au format M ou MM.
     * @param année année au format AAAA.
     * @return le nombre de jours dans ce mois.
     */
    public static int nombreJours(int mois, int année) {
        if (mois < 1 || mois > 12) {
            throw new IllegalArgumentException("Numéro du mois incohérent " + mois);
        }
        int nbJours = 31;
        if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            nbJours = 30;
        } else if (mois == 2) {
            if (estBissextile(année)) {
                nbJours = 29;
            } else {
                nbJours = 28;
            }
        }
        return nbJours;
    }

    /**
     * Méthode qui retourne la valeur de la congruence de Zeller correspondant
     * au jour reçu en paramètre.
     *
     * @see
     * <a href="https://en.wikipedia.org/wiki/Zeller's_congruence">Information
     * sur la congruence de Zeller.</a>
     *
     * @param jour numéro du jour de 1 à 31.
     * @param mois numéro du mis au format M ou MM.
     * @param année année au format AAAA.
     * @return la valeur de la congruence de Zeller.
     */
    public static int numéroJour(int jour, int mois, int année) {
        if (mois < 1 || mois > 12) {
            throw new IllegalArgumentException("Numéro du mois incohérent " + mois);
        }

        if (jour < 1 || jour > nombreJours(mois, année)) {
            throw new IllegalArgumentException("Numéro du jour impossible pour ce mois " + jour + " " + mois);
        }

        int annéeCorrigée = année;
        int m = mois;
        int q = jour;

        if (mois == 1 || mois == 2) {
            annéeCorrigée = année - 1;
            m = mois + 12;
        }

        int j = annéeCorrigée / 100;
        int k = annéeCorrigée % 100;

        return (q + ((m + 1) * 13) / 5 + k + k / 4 + j / 4 + 5 * j + 5) % 7;
    }

    /**
     * Point d'entrée de l'application permettant d’afficher sur le terminal le
     * calendrier d’un mois et d’une année données.
     *
     * @param args aucun argument en ligne de commande n'est attendu.
     */
    public static void main(String[] args) {
        try {
            int mois = Lecture.lireEntier("Entrez le numéro du mois au format M ou MM: ", 0, 12);
            int année = Lecture.lireEntier("Entrez l'année au format AAAA: ");
            afficherTitre(mois, année);
            afficherEntête();
            int nbJours = nombreJours(mois, année);
            int décalage = numéroJour(1, mois, année);
            afficherMois(décalage, nbJours);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur dans les argurments passés en paramètre");
            e.printStackTrace();
        }
    }
}
