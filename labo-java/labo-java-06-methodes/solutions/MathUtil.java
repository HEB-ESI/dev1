package esi.dev1.td6;

public class MathUtil {

    static double périmètreCercle(double rayon) {
        //Utilisons la constante Math.PI 
        return 2 * Math.PI * rayon;
    }

    static double aireCercle(double rayon) {
        //Utilisons la constante Math.PI 
        return Math.PI * rayon * rayon;
    }

    static double min2(double x, double y) {
        double minimum = x;
        if (y < minimum) {
            minimum = y;
        }
        return minimum;
    }

    static double min3(double x, double y, double z) {
        double minimum = min2(x, y);
        return min2(z, minimum);
    }

    static double moyenne(double x, double y) {
        return (x + y) / 2;
    }

    static boolean estDivisible(int a, int b) {
        return a % b == 0;
    }

    static int abs(int nb) {
        //À votre avis que fait la méthode Math.abs() ?
        int résultat = nb;
        if (résultat < 0) {
            résultat = -résultat;
        }
        return résultat;
    }

    static int unité(int nb) {
        return nb % 10;
    }

    static int dizaine(int nb) {
        return (nb / 10) % 10;
    }

    static int centaine(int nb) {
        return (nb / 100) % 100;
    }

    static int miroir(int nb) {
        return unité(nb) * 100 + dizaine(nb) * 10 + centaine(nb);
    }

    public static void main(String[] args) {
        double périmètre = périmètreCercle(10);
        double aire = aireCercle(10);
        System.out.println("Le périmètre d’un cercle de rayon 10 est: " + périmètre);
        System.out.println("L'aire d’un cercle de rayon 10 est: " + aire);

        System.out.println("Le minimum entre 10 et 6 est de " + min2(10, 6));
        System.out.println("Le minimum entre 10, 6 et 19 est de " + min3(10, 6, 19));

        System.out.println("La moyenne entre 10.5 et 15.5 est de " + moyenne(10.5, 15.5));

        System.out.println("15 est il divisible par 5 " + estDivisible(15, 5));

        System.out.println("15 est il divisible par 2 " + estDivisible(15, 2));

        System.out.println("La valeur absolue de 4 est " + abs(4));

        System.out.println("La valeur absolue de -4 est " + abs(-4));

        System.out.println("Le miroir de 254 est " + miroir(254));

    }
}
