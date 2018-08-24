
package g12345.dev1.td2;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez votre age:");
        int age = clavier.nextInt();
        
        if(age>18) {
            System.out.println("vous êtes majeur");
        }
    }
 
}
