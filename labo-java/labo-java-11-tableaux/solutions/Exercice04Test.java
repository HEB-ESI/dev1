package esi.dev1.td10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercice04Test {

    @Test(expected = IllegalArgumentException.class)
    public void testAfficherTaillesNull() {
        System.out.println("testAfficherTaillesNull");
        String[] tab = null;
        Exercice04.afficherTailles(tab);
    }

    @Test
    public void testAfficherTaillesVide() {
        System.out.println("testAfficherTaillesVide");
        String[] tab = {};
        Exercice04.afficherTailles(tab);
    }

    @Test
    public void testAfficherTaillesTaille3() {
        System.out.println("testAfficherTaillesTaille3");
        String[] tab = {"a", "bc", "def"};
        Exercice04.afficherTailles(tab);
    }

    @Test
    public void testAfficherTaillesAutreTaille() {
        System.out.println("testAfficherTaillesAutreTaille");
        String[] tab = {"a", "bc", "def", "ghij"};
        Exercice04.afficherTailles(tab);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPlusLongMotNull() {
        System.out.println("testPlusLongMotNull");
        String[] tab = null;
        Exercice04.plusLongMot(tab);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPlusLongMotVide() {
        System.out.println("testPlusLongMotVide");
        String[] tab = {};
        Exercice04.plusLongMot(tab);
    }

    @Test
    public void testPlusLongMotDernierMot() {
        System.out.println("testPlusLongMotDernierMot");
        String[] tab = {"a","bc","def"};
        String expResult = "def";
        String result = Exercice04.plusLongMot(tab);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlusLongMotPremierMot() {
        System.out.println("testPlusLongMotPremierMot");
        String[] tab = {"abcde","bc","def","ghij"};
        String expResult = "abcde";
        String result = Exercice04.plusLongMot(tab);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlusLongMotAutreMot() {
        System.out.println("testPlusLongMotAutreMot");
        String[] tab = {"ab","bc","defghij","ghij"};
        String expResult = "defghij";
        String result = Exercice04.plusLongMot(tab);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlusLongMotPlusieursMots() {
        System.out.println("testPlusLongMotPlusieursMots");
        String[] tab = {"abcd","bcef","defg","ghi"};
        String expResult = "abcd";
        String result = Exercice04.plusLongMot(tab);
        assertEquals(expResult, result);
    }
}
