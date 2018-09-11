package esi.dev1.td8;

public class Math {

    /**
     * Calcule la valeur absolue d'un nombre.
     *
     * @param message message à afficher.
     * @return l'entier saisi par l'utilisateur.
    */
    static double abs(double x) {
        double solution = x;

        if(x < 0) {
            solution = -x;
        }

        return solution;
    }
    
    public static void main(String[] args) {
        int entrée;
        int sortie;

        entrée = 4;
        sortie = 4;
        System.out.println("abs(" + entrée + ") = " + sortie + " ? " 
            + (abs(entrée) == sortie));

        entrée = -6;
        sortie = 6;
        System.out.println("abs(" + entrée + ") = " + sortie + " ? " 
            + (abs(entrée) == sortie));
    }
}