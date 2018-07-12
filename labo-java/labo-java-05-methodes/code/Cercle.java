package esi.dev1.td5;

public class Cercle {

    static double périmètre(double rayon) {
        return 2 * 3.141596 * rayon ;
    }
    
    public static void main(String[] args) {
        System.out.print("Le périmètre d'un cercle de rayon 10 est: "+ périmètre(10));        
    }
}