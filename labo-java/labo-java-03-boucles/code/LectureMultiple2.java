package esi.dev1.td3;

public class LectureMultiple1 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Combien de valeurs voulez-vous entrer?");
        int n = clavier.nextInt();
        int somme = 0;
        int i = 1;

        while(i <= n) {
            System.out.println("entrez une valeur: ");
            int valeur = clavier.nextInt();
            somme = somme + valeur;
            i = i+1;
        }
        
        System.out.println("vous avez rentré : "+ n +" valeurs");
        System.out.println("La somme de toutes ces valeurs: "+ somme);
    }
}
