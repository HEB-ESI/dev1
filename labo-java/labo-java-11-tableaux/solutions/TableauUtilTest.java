package esi.dev1.td10;

import org.junit.Assert;
import org.junit.Test;

public class TableauUtilTest {

    @Test(expected = IllegalArgumentException.class)
    public void testMinNull() {
        System.out.println("testMinNull");
        double[] tab = null;
        TableauUtil.min(tab);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinVide() {
        System.out.println("testMinVide");
        double[] tab = {};
        TableauUtil.min(tab);
    }

    @Test
    public void testMinPremier() {
        System.out.println("testMinPremier");
        double[] tab = {1, 2, 3, 4};
        double expResult = 1;
        double result = TableauUtil.min(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMinDernier() {
        System.out.println("testMinDernier");
        double[] tab = {1, 2, 3, 4, -25};
        double expResult = -25;
        double result = TableauUtil.min(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMinZéro() {
        System.out.println("testMinZéro");
        double[] tab = {1, 0, 3, 4};
        double expResult = 0.0;
        double result = TableauUtil.min(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMinPlusieurs() {
        System.out.println("testMinPlusieurs");
        double[] tab = {10, 7, 7, 8, 7, 9};
        double expResult = 7.0;
        double result = TableauUtil.min(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxNull() {
        System.out.println("testMaxNull");
        double[] tab = null;
        TableauUtil.max(tab);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxVide() {
        System.out.println("testMaxVide");
        double[] tab = {};
        TableauUtil.max(tab);

    }

    @Test
    public void testMaxPremier() {
        System.out.println("testMaxPremier");
        double[] tab = {10, 2, 3, 4};
        double expResult = 10.0;
        double result = TableauUtil.max(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMaxDernier() {
        System.out.println("testMaxDernier");
        double[] tab = {-100, -200, -30, -45, -25};
        double expResult = -25.0;
        double result = TableauUtil.max(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMaxZéro() {
        System.out.println("testMaxZéro");
        double[] tab = {-1, 0, -3, -4};
        double expResult = 0.0;
        double result = TableauUtil.max(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMaxPlusieurs() {
        System.out.println("testMaxPlusieurs");
        double[] tab = {10, 70, 70, 8, 70, 9};
        double expResult = 70.0;
        double result = TableauUtil.max(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSommeNull() {
        System.out.println("testSommeNull");
        double[] tab = null;
        TableauUtil.somme(tab);

    }

    @Test
    public void testSommeVide() {
        System.out.println("testSommeVide");
        double[] tab = {};
        double expResult = 0.0;
        double result = TableauUtil.somme(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSommePositif() {
        System.out.println("testSommePositif");
        double[] tab = {10, 21, 5, 4};
        double expResult = 40.0;
        double result = TableauUtil.somme(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSommeMélange() {
        System.out.println("testSommeMélange");
        double[] tab = {-10, 25, -5, 4, -9};
        double expResult = 5.0;
        double result = TableauUtil.somme(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoyenneNull() {
        System.out.println("testMoyenneNull");
        double[] tab = null;
        TableauUtil.moyenne(tab);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoyenneVide() {
        System.out.println("testMoyenneVide");
        double[] tab = {};
        TableauUtil.moyenne(tab);
    }

    @Test
    public void testMoyennePositif() {
        System.out.println("testMoyennePositif");
        double[] tab = {10, 21, 5, 4};
        double expResult = 10.0;
        double result = TableauUtil.moyenne(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMoyenneMélange() {
        System.out.println("testMoyenneMélange");
        double[] tab = {-10, 25, -5, 4, -9};
        double expResult = 1.0;
        double result = TableauUtil.moyenne(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMoyenneSeul() {
        System.out.println("testMoyenneSeul");
        double[] tab = {-12};
        double expResult = -12.0;
        double result = TableauUtil.moyenne(tab);
        Assert.assertEquals(expResult, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCopieNull() {
        System.out.println("testCopieNull");
        double[] tab = null;
        TableauUtil.copie(tab);
    }

    @Test
    public void testCopieVide() {
        System.out.println("testCopieVide");
        double[] tab = {};
        double[] expResult = {};
        double[] result = TableauUtil.copie(tab);
        Assert.assertArrayEquals(expResult, result, 0.0);
        Assert.assertFalse(tab == expResult);
    }

    @Test
    public void testCopiePositif() {
        System.out.println("testCopiePositif");
        double[] tab = {10, 21, 5, 4};
        double[] expResult = {10, 21, 5, 4};
        double[] result = TableauUtil.copie(tab);
        Assert.assertArrayEquals(expResult, result, 0.0);
        Assert.assertFalse(tab == expResult);
    }

    @Test
    public void testCopieMélange() {
        System.out.println("testCopiePositif");
        double[] tab = {-10, 25, -5, 4, -9};
        double[] expResult = {-10, 25, -5, 4, -9};
        double[] result = TableauUtil.copie(tab);
        Assert.assertArrayEquals(expResult, result, 0.0);
        Assert.assertFalse(tab == expResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndiceMaxNull() {
        System.out.println("testIndiceMaxNull");
        double[] tab = null;
        TableauUtil.indiceMax(tab);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndiceMaxVide() {
        System.out.println("testIndiceMaxVide");
        double[] tab = {};
        TableauUtil.indiceMax(tab);
    }

    @Test
    public void testIndiceMaxpremier() {
        System.out.println("indiceMax");
        double[] tab = {10, 2, 3, 4};
        int expResult = 0;
        int result = TableauUtil.indiceMax(tab);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testIndiceMaxDernier() {
        System.out.println("testIndiceMaxDernier");
        double[] tab = {-100, -200, -30, -45, -25};
        int expResult = 4;
        int result = TableauUtil.indiceMax(tab);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testIndiceMaxZéro() {
        System.out.println("testIndiceMaxZéro");
        double[] tab = {-1, 0, -3, -4};
        int expResult = 1;
        int result = TableauUtil.indiceMax(tab);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testIndiceMaxPlusieurs() {
        System.out.println("testIndiceMaxPlusieurs");
        double[] tab = {10, 70, 70, 8, 70, 9};
        int expResult = 1;
        int result = TableauUtil.indiceMax(tab);
        Assert.assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEstTriéNull() {
        System.out.println("testEstTriéNull");
        double[] tab = null;
        TableauUtil.estTrié(tab);
    }

    @Test
    public void testEstTriéVide() {
        System.out.println("testEstTriéVide");
        double[] tab = {};
        boolean result = TableauUtil.estTrié(tab);
        Assert.assertTrue(result);
    }

    @Test
    public void testEstTriéFaux() {
        System.out.println("testEstTriéFaux");
        double[] tab = {10, 2, 3, 4};
        boolean result = TableauUtil.estTrié(tab);
        Assert.assertFalse(result);
    }

    @Test
    public void testEstTriéVrai() {
        System.out.println("testEstTriéVrai");
        double[] tab = {-10, -2, 0, 40, 554};
        boolean result = TableauUtil.estTrié(tab);
        Assert.assertTrue(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndiceNull() {
        System.out.println("testIndiceNull");
        int[] tab = null;
        int valeur = 12;
        TableauUtil.indice(tab, valeur);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndiceVide() {
        System.out.println("testIndiceVide");
        int[] tab = {};
        int valeur = 12;
        TableauUtil.indice(tab, valeur);
    }

    @Test
    public void testIndicePremier() {
        System.out.println("testIndicePremier");
        int[] tab = {10, 2, 3, 4};
        int valeur = 10;
        int expResult = 0;
        int result = TableauUtil.indice(tab, valeur);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testIndiceDernier() {
        System.out.println("testIndiceDernier");
        int[] tab = {-1, 0, 15, -3, -7};
        int valeur = -7;
        int expResult = 4;
        int result = TableauUtil.indice(tab, valeur);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testIndicePlusieurs() {
        System.out.println("testIndicePlusieurs");
        int[] tab = {2, 0, 10, 10};
        int valeur = 10;
        int expResult = 2;
        int result = TableauUtil.indice(tab, valeur);
        Assert.assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndiceAbsent() {
        System.out.println("testIndiceAbsent");
        int[] tab = {2, 0, 10, 10};
        int valeur = 50;
        TableauUtil.indice(tab, valeur);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContientTexteNull() {
        System.out.println("testContientTexteNull");
        String[] tab = null;
        String mot = "test";
        TableauUtil.contient(tab, mot);
    }

    @Test
    public void testContientTexteVide() {
        System.out.println("testContientTexteVide");
        String[] tab = {};
        String mot = "bonjour";
        boolean result = TableauUtil.contient(tab, mot);
        Assert.assertFalse(result);
    }

    @Test
    public void testContientTextePremier() {
        System.out.println("testContientTextePremier");
        String[] tab = {"abc", "bc", "defgh"};
        String mot = "abc";
        boolean result = TableauUtil.contient(tab, mot);
        Assert.assertTrue(result);
    }

    @Test
    public void testContientTexteDernier() {
        System.out.println("testContientTexteDernier");
        String[] tab = {"abc", "bc", "def", "ghij"};
        String mot = "ghij";
        boolean result = TableauUtil.contient(tab, mot);
        Assert.assertTrue(result);
    }

    @Test
    public void testContientTextePlusieurs() {
        System.out.println("testContientTextePlusieurs");
        String[] tab = {"abc", "bc", "def", "bc"};
        String mot = "bc";
        boolean result = TableauUtil.contient(tab, mot);
        Assert.assertTrue(result);
    }

    @Test
    public void testContientTexteAbsent() {
        System.out.println("testContientTexteAbsent");
        String[] tab = {"abc", "bc", "defgh"};
        String mot = "bonjour";
        boolean result = TableauUtil.contient(tab, mot);
        Assert.assertFalse(result);
    }

    @Test
    public void testContientTexteCamelCase() {
        System.out.println("testContientTextePremier");
        String[] tab = {"abc", "BonJour", "def", "BonJour"};
        String mot = "BonJour";
        boolean result = TableauUtil.contient(tab, mot);
        Assert.assertTrue(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContientDoubleNull() {
        System.out.println("testContientDoubleNull");
        double[] tab = null;
        double valeur = 17.0;
        double erreur = 0.0;
        TableauUtil.contient(tab, valeur, erreur);
    }

    @Test
    public void testContientDoubleVide() {
        System.out.println("testContientDoubleVide");
        double[] tab = {};
        double valeur = 12.0;
        double erreur = 0.0;
        boolean result = TableauUtil.contient(tab, valeur, erreur);
        Assert.assertFalse(result);
    }

    @Test
    public void testContientDoublePremier() {
        System.out.println("testContientDoublePremier");
        double[] tab = {10, 2, 3, 4};
        double valeur = 10.0;
        double erreur = 0.0;
        boolean result = TableauUtil.contient(tab, valeur, erreur);
        Assert.assertTrue(result);
    }

    @Test
    public void testContientDoubleDernier() {
        System.out.println("testContientDoubleDernier");
        double[] tab = {-1, 0, 15, -3, -7};
        double valeur = -7.0;
        double erreur = 0.0;
        boolean result = TableauUtil.contient(tab, valeur, erreur);
        Assert.assertTrue(result);
    }

    @Test
    public void testContientDoublePlusieurs() {
        System.out.println("testContientDoublePlusieurs");
        double[] tab = {2, 0, 10, 10};
        double valeur = 10.0;
        double erreur = 0.0;
        boolean result = TableauUtil.contient(tab, valeur, erreur);
        Assert.assertTrue(result);
    }

    @Test
    public void testContientDoubleAbsent() {
        System.out.println("testContientDoubleAbsent");
        double[] tab = {20, 70, 10, 10};
        double valeur = 5.0;
        double erreur = 0.0;
        boolean result = TableauUtil.contient(tab, valeur, erreur);
        Assert.assertFalse(result);
    }

    @Test
    public void testContientDoubleAbsentAbsolu() {
        System.out.println("testContientDoubleAbsentAbsolu");
        double[] tab = {20, 70, 10, 10};
        double valeur = 500.0;
        double erreur = 0.0;
        boolean result = TableauUtil.contient(tab, valeur, erreur);
        Assert.assertFalse(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInverserNull() {
        System.out.println("testInverserNull");
        double[] tab = null;
        TableauUtil.inverser(tab);
    }

    @Test
    public void testInverserVide() {
        System.out.println("testInverserVide");
        double[] tab = {};
        double[] expResult = {};
        TableauUtil.inverser(tab);
        Assert.assertArrayEquals(expResult, tab, 0.0);
    }

    @Test
    public void testInverserTaillePaire() {
        System.out.println("testInverserTaillePaire");
        double[] tab = {1, 2, 3, 4};
        double[] expResult = {4, 3, 2, 1};
        TableauUtil.inverser(tab);
        Assert.assertArrayEquals(expResult, tab, 0.0);
    }

    @Test
    public void testInverserTailleImpaire() {
        System.out.println("testInverserTailleImpaire");
        double[] tab = {-12, 8, -4, 9, -25};
        double[] expResult = {-25, 9, -4, 8, -12};
        TableauUtil.inverser(tab);
        Assert.assertArrayEquals(expResult, tab, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoublonsNull() {
        System.out.println("testDoublonsNull");
        int[] tab = null;
        TableauUtil.doublons(tab);
    }

    @Test
    public void testDoublonsVide() {
        System.out.println("testDoublonsVide");
        int[] tab = {};
        boolean result = TableauUtil.doublons(tab);
        Assert.assertFalse(result);
    }

    @Test
    public void testDoublonsVrai() {
        System.out.println("testDoublonsVrai");
        int[] tab = {1, 2, 3, 2, 5, 7};
        boolean result = TableauUtil.doublons(tab);
        Assert.assertTrue(result);
    }

    @Test
    public void testDoublonsFaux() {
        System.out.println("testDoublonsFaux");
        int[] tab = {1, 2, 3, 4, 5};
        boolean result = TableauUtil.doublons(tab);
        Assert.assertFalse(result);
    }

    @Test
    public void testDoublonsVraiDernier() {
        System.out.println("testDoublonsVraiDernier");
        int[] tab = {1, 2, 3, 2};
        boolean result = TableauUtil.doublons(tab);
        Assert.assertTrue(result);
    }

    @Test
    public void testDoublonsVraiPlusieurs() {
        System.out.println("testDoublonsVraiPlusieurs");
        int[] tab = {1, 2, 3, 2, 5, 1};
        boolean result = TableauUtil.doublons(tab);
        Assert.assertTrue(result);
    }

    @Test
    public void testDoublonsTriplet() {
        System.out.println("testDoublonsTriplet");
        int[] tab = {1, 2, 3, 2, 5, 2};
        boolean result = TableauUtil.doublons(tab);
        Assert.assertTrue(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNbNégatifsNull() {
        System.out.println("testNbNégatifsNull");
        double[] tab = null;
        TableauUtil.nbNégatifs(tab);
    }

    @Test
    public void testNbNégatifsVide() {
        System.out.println("testNbNégatifsVide");
        double[] tab = {};
        int expResult = 0;
        int result = TableauUtil.nbNégatifs(tab);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testNbNégatifsAucun() {
        System.out.println("testNbNégatifsAucun");
        double[] tab = {1, 2, 3, 2};
        int expResult = 0;
        int result = TableauUtil.nbNégatifs(tab);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testNbNégatifsSeul() {
        System.out.println("testNbNégatifsSeul");
        double[] tab = {1, 2, 3, -2, 5, 1};
        int expResult = 1;
        int result = TableauUtil.nbNégatifs(tab);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testNbNégatifsPlusieurs() {
        System.out.println("testNbNégatifsPlusieurs");
        double[] tab = {1, -2, 3, 2, -5, 1};
        int expResult = 2;
        int result = TableauUtil.nbNégatifs(tab);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testNbNégatifsTous() {
        System.out.println("testNbNégatifsTous");
        double[] tab = {-1, -2, -3};
        int expResult = 3;
        int result = TableauUtil.nbNégatifs(tab);
        Assert.assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testÉchangeNull() {
        System.out.println("testÉchangeNull");
        double[] tab = null;
        int indice1 = 0;
        int indice2 = 0;
        TableauUtil.échange(tab, indice1, indice2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testÉchangeVide() {
        System.out.println("testÉchangeVide");
        double[] tab = {};
        int indice1 = 0;
        int indice2 = 0;
        TableauUtil.échange(tab, indice1, indice2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testÉchangeIndice1Out() {
        System.out.println("testÉchangeIndice1Out");
        double[] tab = {1, 2, 3, 2};
        int indice1 = 4;
        int indice2 = 1;
        TableauUtil.échange(tab, indice1, indice2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testÉchangeIndice2Out() {
        System.out.println("testÉchangeIndice2Out");
        double[] tab = {1, 2, 3, 2};
        int indice1 = 1;
        int indice2 = 4;
        TableauUtil.échange(tab, indice1, indice2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testÉchangeIndice1Négatif() {
        System.out.println("testÉchangeIndice1Négatif");
        double[] tab = {1, 2, 3, 2};
        int indice1 = -1;
        int indice2 = 0;
        TableauUtil.échange(tab, indice1, indice2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testÉchangeIndice2Négatif() {
        System.out.println("testÉchangeIndice2Négatif");
        double[] tab = {1, 2, 3, 2};
        int indice1 = 0;
        int indice2 = -4;
        TableauUtil.échange(tab, indice1, indice2);
    }

    @Test
    public void testÉchangeExtremes() {
        System.out.println("testÉchangeExtremes");
        double[] tab = {1, 17, 3, 2};
        double[] expResult = {2, 17, 3, 1};
        int indice1 = 0;
        int indice2 = 3;
        TableauUtil.échange(tab, indice1, indice2);
        Assert.assertArrayEquals(expResult, tab, 0.0);
    }

    @Test
    public void testÉchangeClassique() {
        System.out.println("testÉchangeClassique");
        double[] tab = {1, 17, 3, 44, 69, 2, 77};
        double[] expResult = {1, 17, 2, 44, 69, 3, 77};
        int indice1 = 2;
        int indice2 = 5;
        TableauUtil.échange(tab, indice1, indice2);
        Assert.assertArrayEquals(expResult, tab, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndicesMinNull() {
        System.out.println("testIndicesMinNull");
        double[] tab = null;
        TableauUtil.indicesMin(tab);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIndicesMinVide() {
        System.out.println("testIndicesMinVide");
        double[] tab = {};
        TableauUtil.indicesMin(tab);
    }

    @Test
    public void testIndicesMinSeulPremier() {
        System.out.println("testIndicesMinSeulPremier");
        double[] tab = {1,2,3,4};
        int[] expResult = {0};
        int[] result = TableauUtil.indicesMin(tab);
        Assert.assertArrayEquals(expResult, result);
    }

    @Test
    public void testIndicesMinSeulDernier() {
        System.out.println("testIndicesMinSeulDernier");
        double[] tab = {1,2,3,4,-25};
        int[] expResult = {4};
        int[] result = TableauUtil.indicesMin(tab);
        Assert.assertArrayEquals(expResult, result);
    }

    @Test
    public void testIndicesMinSeulMilieu() {
        System.out.println("testIndicesMinSeulMilieu");
        double[] tab = {1,2,-36,4,-25};
        int[] expResult = {2};
        int[] result = TableauUtil.indicesMin(tab);
        Assert.assertArrayEquals(expResult, result);
    }

    @Test
    public void testIndicesMinPlusieurs() {
        System.out.println("testIndicesMinPlusieurs");
        double[] tab = {15,23,10,42,10,10,89};
        int[] expResult = {2,4,5};
        int[] result = TableauUtil.indicesMin(tab);
        Assert.assertArrayEquals(expResult, result);
    }

    @Test
    public void testIndicesMinPlusieursExtremes() {
        System.out.println("testIndicesMinPlusieursExtremes");
        double[] tab = {2,23,2,42,10,10,2};
        int[] expResult = {0,2,6};
        int[] result = TableauUtil.indicesMin(tab);
        Assert.assertArrayEquals(expResult, result);
    }
    @Test
    public void testIndicesMinTous() {
        System.out.println("testIndicesMinTous");
        double[] tab = {1,1,1,1};
        int[] expResult = {0,1,2,3};
        int[] result = TableauUtil.indicesMin(tab);
        Assert.assertArrayEquals(expResult, result);
    }
}
