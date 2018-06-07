package esi.dev1.td3;

public class LectureMultiple2 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez les valeurs (terminez par -1)");
        int valeur = clavier.nextInt();
        int somme = 0;
        int i = 0;

        while(valeur > -1) {
            somme = somme + valeur;
            i = i+1;
            System.out.println("entrez une valeur: ");
            valeur = clavier.nextInt();
        }
        
        System.out.println("vous avez rentré : "+ i +" valeurs");
        System.out.println("La somme de toutes ces valeurs: "+ somme);
    }
}
