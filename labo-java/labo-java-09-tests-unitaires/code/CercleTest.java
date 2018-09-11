package esi.dev1.td8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Drobisz Sébastien
 */
public class CercleTest {
    /**
     * Test de la méthode périmètre avec le lancement d'une exception
     */
    @Test(expected=IllegalArgumentException.class)
    public void testMain() {
        System.out.println("Avec rayon négatif menant à une exception");
        Cercle.périmètre(-5);
    }
    
}
