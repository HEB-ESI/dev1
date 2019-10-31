package esi.dev1.td10;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class Exercice01Test {

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplierNull() {
        System.out.println("testMultiplierNull");
        int[] tab = null;
        int valeur = 0;
        Exercice01.multiplier(tab, valeur);
    }

    @Test
    public void testMultiplierVide() {
        System.out.println("testMultiplierVide");
        int[] tab = {};
        int valeur = 0;
        int[] expResult = {};
        Exercice01.multiplier(tab, valeur);
        assertArrayEquals(expResult, tab);
    }

    @Test
    public void testMultiplierPositif() {
        System.out.println("testMultiplierPositif");
        int[] tab = {1,2,3};
        int valeur = 3;
        int[] expResult = {3,6,9};
        Exercice01.multiplier(tab, valeur);
        assertArrayEquals(expResult, tab);
    }

    @Test
    public void testMultiplierNégatif() {
        System.out.println("testMultiplierNégatif");
        int[] tab = {-12,8,-4,9};
        int valeur = -2;
        int[] expResult = {24,-16,8,-18};
        Exercice01.multiplier(tab, valeur);
        assertArrayEquals(expResult, tab);
    }
}
