package esi.dev1.util;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author fservais
 */
public class Dictionnaire {

    private static final String[] DICO;
    // rem. : final en java porte sur la référence, pas sur le contenu référencé
    // => il est possible de mofifier le contenu du tableau, mais
    //    pas de référencer un autre tableau :
    //      DICO[0] = "33"; est possible
    //      DICO = new String[3]; ne compile pas

    static {
        Scanner input = new Scanner(Dictionnaire.class
                .getResourceAsStream("/resources/dico.txt"));

        //init DICO
        DICO = new String[input.nextInt()];

        // remplir DICO
        int i = 0;
        while (input.hasNext()) {
            DICO[i++] = input.next();
        }
        
        input.close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("10 mots au hasard: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mots()[(int) (Math.random() * 59232)]);
        }
    }

    public static String[] mots() {
        return DICO;
        // attention : le contenu du dictionnaire est modifiable...
        // pour l'empêcher, il faut cloner le tableau, ce que je
        // ne veux surtout pas, ou se détourner des vieux tableaux
        // https://stackoverflow.com/a/14809392
    }
}
