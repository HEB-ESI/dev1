package esi.dev1.td10;

public class MonMath {

    /**
     * Calcule la valeur absolue d'un nombre.
     *
     * @param message message à afficher.
     * @return l'entier saisi par l'utilisateur.
    */
    public static double abs(double x) {
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
        System.out.println("Teste 1 : abs(" + entrée + ") = " + sortie + " ? " 
            + (abs(entrée) == sortie));

        entrée = -6;
        sortie = 6;
        System.out.println("Teste 2 : abs(" + entrée + ") = " + sortie + " ? " 
            + (abs(entrée) == sortie));
    }
}
