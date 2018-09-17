package esi.dev1.td6;

public class ChaineUtil {

    static char premièreLettre(String mot) {
        //A votre avis que doit-on faire si aucun mot n'est donné en paramètre ?
        return mot.charAt(0);
    }

    static char dernièreLettre(String mot) {
        //A votre avis que doit-on faire si aucun mot n'est donné en paramètre ?
        return mot.charAt(mot.length() - 1);
    }

    static int nombreVoyelles(String mot) {
        int nbVoyelles = 0;
        String minuscules = mot.toLowerCase();
        for (int i = 0; i < minuscules.length(); ++i) {
            switch (minuscules.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    nbVoyelles++;
                    break;
                default:
                // do nothing
            }
        }
        return nbVoyelles;
        //Que pensez-vous de la ligne ci-dessous ?
        //s.length() - s.toLowerCase().replaceAll("a|e|i|o|u|", "").length()
    }

    static int nombreConsonnes(String mot) {
        return mot.length() - nombreVoyelles(mot);
    }

    static boolean estPalindrome(String mot) {
        int n = mot.length();
        for (int i = 0; i < n / 2; i++) {
            if (mot.charAt(i) != mot.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Première lettre de Java " + premièreLettre("Java"));
        System.out.println("Dernière lettre de Java " + dernièreLettre("Java"));
        System.out.println("Le nombre de voyelles dans le mot Programmation est de " + nombreVoyelles("Programmation"));
        System.out.println("Le nombre de consonnes dans le mot Programmation est de " + nombreConsonnes("Programmation"));
        System.out.println("Le mot ressasser est-il un palindrome : " + estPalindrome("ressasser"));
        System.out.println("Le mot pastèque est-il un palindrome : " + estPalindrome("pastèque"));

    }
}
