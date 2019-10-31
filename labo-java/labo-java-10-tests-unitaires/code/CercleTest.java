package esi.dev1.td8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ESI Prof
 */
public class CercleTest {
    /**
     * Test de la méthode périmètre avec le lancement d'une exception
     */
    @Test(expected=IllegalArgumentException.class)
    public void périmètre_rayonNégatif_IAException() {
        Cercle.périmètre(-5);
    }
    
}
