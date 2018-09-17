package esi.dev1.td10;

import org.junit.Test;
import static org.junit.Assert.*;

public class TableauTest {

    @Test
    public void testIncrémenter() {
        int[] tab = {1, 2, 3};
        Tableau.incrémenter(tab);
        int[] tabAttendu = {2, 3, 4};
        assertArrayEquals(tabAttendu, tab);
    }
    
    @Test
    public void testIncrémenterTableauVide() {
        int[] tab = {};
        Tableau.incrémenter(tab);
        int[] tabAttendu = {};
        assertArrayEquals(tabAttendu, tab);
    }
    
}
