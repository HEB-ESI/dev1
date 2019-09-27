package esi.dev1.td6;

public class Cercle {

    static double périmètre(double rayon) {
        return 2 * Math.PI * rayon ;
    }
    
    public static void main(String[] args) {
        System.out.println("Le périmètre d'un cercle de rayon 10 est: "+ périmètre(10));
    }
}
