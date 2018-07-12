package esi.dev1.td5;

public class Mot {

    static char premièreLettre(String mot) {
        return mot.charAt(0);
    }
    
    public static void main(String[] args) {
        System.out.println(premièreLettre("Java"));
        System.out.println(premièreLettre("Programmation"));
    }
}