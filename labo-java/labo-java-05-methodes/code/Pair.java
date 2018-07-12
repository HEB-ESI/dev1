package esi.dev1.td5;

public class Pair {

    static boolean estPair(int nb) {
        return (nb%2) == 0;
    }
    
    public static void main(String[] args) {
        if(estPair(10)) {
            System.out.println("10 est pair")
        } else {
            System.out.println("10 est impair")
        }
    }
}