package esi.dev1.td10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ESI Prof
 */
public class CercleTest {
    /**
     * Test de la méthode périmètre avec le lancement d'une exception
     */
    @Test
    public void périmètre_rayonNégatif_IAException() {
        assertThrows(IllegalArgumentException.class, () -> MonMath.périmètre(-5));
    }
    
}
