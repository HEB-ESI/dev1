import java.util.Scanner;

/**
 * Petit programme servant de point de départ 
 * pour illustrer la compilation et l'exécution sans package.
 */
public class Hello {

	/**
	 * Affiche un message de bienvenue
	 * puis lance la moyenne de 2 nombres lus au clavier.
	 */
	public static void main(String[] args) {
		System.out.println("Bonjour !");
		moyenne2Nombres();
	}
 
	/**
	 * Affiche la moyenne de 2 nombres réels lus au clavier.
	 */

	public static void moyenne2Nombres() {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Calcul de la moyenne de 2 nombres réels.");
		System.out.print("Entrez un premier nombre: ");
		double nb1 = kbd.nextDouble();
		System.out.print("Entrez un second nombre: ");
		double nb2 = kbd.nextDouble();
		double moyenne = moyenne2Nombres(nb1,nb2);
		System.out.println("Leur moyenne est : " + moyenne);
	}

	/**
	 * Calcule la moyenne de 2 nombres donnés.
	 * @param nb1 le premier nombre.
	 * @param nb2 le second nombre.
	 * @return la moyenne de nb1 et nb2.
	 */
	public static double moyenne2Nombres(double nb1, double nb2) {
		return (nb1+nb2)/2;
	}


}
