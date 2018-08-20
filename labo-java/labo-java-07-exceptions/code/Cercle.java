package esi.dev1.td7;

public class Cercle {

    /**
    * Calcule et retourne le périmètre d'un cercle de rayon donné.
    *
    * @param rayon le rayon du cercle
    * @return le périmètre du cercle de rayon \code{rayon}
    */
    static double périmètre(double rayon) {
        if(rayon <= 0) {
            throw new IllegalArgumentException("Le rayon doit être positif: "+rayon);
        }
        return 2 * Math.PI * rayon;
    }
    
    public static void main(String[] args) {
        System.out.println(périmètre(10));
        System.out.println(périmètre(-3));
    }
}