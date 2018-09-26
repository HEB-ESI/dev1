package g12345.dev1.calendrier;

import java.util.Scanner;

/**
 * Classe utilitaire pour effectuer des lectures robustes.
 *
 * @author profEsi
 */
public class Lecture {

    /**
     * Lecture robuste d'un entier.
     *
     * Tant que l'entrée de l'utilisateur n'est pas un entier la méthode demande
     * une nouvelle entrée.
     *
     * @param message message à afficher.
     * @return l'entier saisi par l'utilisateur.
     */
    public static int lireEntier(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.println(message);
        while (!clavier.hasNextInt()) {
            clavier.next();
            System.out.println("Le nombre saisi n'est pas un entier.");
            System.out.println(message);
        }
        return clavier.nextInt();
    }

    /**
     * Lecture robuste d'un double.
     *
     * Tant que l'entrée de l'utilisateur n'est pas un double la méthode demande
     * une nouvelle entrée.
     *
     * @param message message à afficher.
     * @return le double saisi par l'utilisateur.
     */
    public static double lireDouble(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.println(message);
        while (!clavier.hasNextDouble()) {
            clavier.next();
            System.out.println("Le nombre saisi n'est pas un double.");
            System.out.println(message);
        }
        return clavier.nextDouble();
    }

    /**
     * Lecture robuste d'un entier compris entre deux bornes.
     *
     * Tant que l'entrée de l'utilisateur n'est pas un entier compris entre deux
     * entiers entrés en paramètre la méthode demande une nouvelle entrée.
     *
     * @param message message à afficher.
     * @param min borne inférieure.
     * @param max borne supérieure.
     * @return l'entier saisi par l'utilisateur.
     */
    public static int lireEntier(String message, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("le minimum est plus grand que le maximum " + min + " " + max);
        }

        int entier = lireEntier(message);
        while (entier < min || entier > max) {
            System.out.println("L'entier n'est pas compris entre " + min + " et " + max);
            entier = lireEntier(message);
        }
        return entier;
    }

}
