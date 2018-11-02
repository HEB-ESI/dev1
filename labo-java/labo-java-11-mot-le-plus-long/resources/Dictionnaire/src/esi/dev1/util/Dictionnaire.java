package esi.dev1.util;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author fservais
 */
public class Dictionnaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("10 mots au hasard: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mots()[(int)(Math.random()*59232)]);
        }
    }

    public static String[] mots() {
        Scanner clavier = null;
        InputStream in = Dictionnaire.class.getResourceAsStream("/resources/dico.txt");
        clavier = new Scanner(in);

        //init dico
        int nbwords = clavier.nextInt();
        String[] dico = new String[nbwords];

        // remplir le dico
        int i = 0;
        while (clavier.hasNext()) {
            dico[i] = clavier.next();
            i++;
        }
        return dico;
    }
}
