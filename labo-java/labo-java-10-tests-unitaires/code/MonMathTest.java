package esi.dev1.td10;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Drobisz Sébastien
 */
public class MathTest {
    
    /**
     * Test of abs method.
     * Case positive ok
     */
    @Test
    public void testAbsCasePositiveOk() {
        System.out.println("Test d'un nombre positif");
        double x = 4.0;
        double expResult = 4.0;
        double result = Math.abs(x);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of abs method.
     * Case negative ok
     */
    @Test
    public void testAbsCaseNegativeOk() {
        System.out.println("Test d'un nombre négatif différent du test 1");
        double x = -6.0;
        double expResult = 6.0;
        double result = Math.abs(x);
        assertEquals(expResult, result, 0.0);
    }
}
