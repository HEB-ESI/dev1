package g12345.dev1.td5;

public class ChaineUtil {
    
    public static void main(String[] args) {
        System.out.println(premièreLettre("Java"));
        System.out.println(dernièreLettre("Java"));
    }
    
    static char premièreLettre(String mot) {
        return mot.charAt(0);
    }
    
    static char dernièreLettre(String mot) {
        return mot.charAt(mot.length()-1);
    }
}
