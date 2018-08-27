package g12345.dev1.td5;

public class MathUtil {

    public static void main(String[] args) {
        double rayon = 10;
        System.out.println(périmètreCercle(rayon));
        System.out.println(aireCercle(rayon));
        
        System.out.println(min2(4.5, 9.8));
        System.out.println(min3(4.5, 9.8, 7.6));
        System.out.println(moyenne(10.5, 15.5));
        System.out.println(estDivisible(10, 5));
    }

    static double périmètreCercle(double rayon) {
        return 2 * 3.141596 * rayon;
    }

    static double aireCercle(double rayon) {
        return 3.141596 * rayon * rayon;
    }

    static double min2(double x, double y) {
        double min = x;
        if(x > y) {
            min = x;
        }
        return min;
    }
    
    static double min3(double x, double y, double z) {
        return min2(x, min2(y, z));
    }
    
    static double moyenne(double x, double y) {
        return (x+y)/2;
    }
    
    static boolean estDivisible(int a, int b) {
        return a%b==0;
    }
}
