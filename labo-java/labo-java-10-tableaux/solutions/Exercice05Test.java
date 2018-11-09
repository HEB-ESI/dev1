package esi.dev1.td10;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Exercice05Test {

    @Test(expected = IllegalArgumentException.class)
    public void testMiroirNull() {
        System.out.println("testMiroirNull");
        int[] tab = null;
        Exercice05.miroir(tab);
    }

    @Test
    public void testMiroirVide() {
        System.out.println("testMiroirVide");
        int[] tab = {};
        int[] expResult = {};
        int[] result = Exercice05.miroir(tab);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testMiroirTaillePaire() {
        System.out.println("testMiroirTaillePaire");
        int[] tab = {1,2,3,4};
        int[] expResult = {4,3,2,1};
        int[] result = Exercice05.miroir(tab);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testMiroirTailleImpaire() {
        System.out.println("testMiroirTailleImpaire");
        int[] tab = {-12,8,-4,9,-25};
        int[] expResult = {-25,9,-4,8,-12};
        int[] result = Exercice05.miroir(tab);
        assertArrayEquals(expResult, result);
    }
}
