package pbt.inline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests de la classe InLine. 
 * 
 * Attention: JUnit 5 
 * 
 * @author Pierre Bettens (pbt) <pbettens@he2b.be>
 */
public class InLineTest {
    
    @Test
    public void testMove_0balsonway(){
        System.out.println("move");
        int[] is =       {0, 5, 0, 0, 4, 0, 2, 1, 2, 0};
        int[] expected = {0, 5, 4, 0, 0, 0, 2, 1, 2, 0};        
        InLine.move(is, 4, 2);
        assertArrayEquals(expected, is);        
    }
    
    @Test
    public void testMove_1balsonway(){
        System.out.println("move");
        int[] is =       {0, 5, 0, 0, 4, 0, 2, 1, 2, 0};
        int[] expected = {0, 5, 2, 0, 4, 0, 0, 1, 2, 0};        
        InLine.move(is, 6, 2);
        assertArrayEquals(expected, is);        
    }
    
    @Test
    public void testMove_fromout(){
        System.out.println("move");
        int[] is =       {0, 5, 0, 0, 4, 0, 2, 1, 2, 0};        
        Throwable exception = assertThrows(IllegalArgumentException.class, 
                () -> {InLine.move(is, 10, 2);});
        assertEquals("from or to out of bounds", exception.getMessage());
    }
    
    @Test
    public void testMove_fromNoBal(){
        System.out.println("move");
        int[] is =       {0, 5, 0, 0, 4, 0, 2, 1, 2, 0};
        Throwable exception = assertThrows(IllegalArgumentException.class, 
                () -> {InLine.move(is, 2, 0);});
        assertEquals("From position empty", exception.getMessage());
    }
    
    
    @Test
    public void testMove_toout(){
        System.out.println("move");
        int[] is =       {0, 5, 0, 0, 4, 0, 2, 1, 2, 0};
        Throwable exception = assertThrows(IllegalArgumentException.class, 
                () -> {InLine.move(is, 0, -1);});
        assertEquals("from or to out of bounds", exception.getMessage());
    }
    
    
    @Test
    public void testMove_toHaveBal(){
        System.out.println("move");
        int[] is =       {0, 5, 0, 0, 4, 0, 2, 1, 2, 0};
        Throwable exception = assertThrows(IllegalArgumentException.class, 
                () -> {InLine.move(is, 1, 4);});
        assertEquals("To position not empty", exception.getMessage());
    }
    
    @Test
    public void testMove_moreThan1balsonwayRightToLeft(){
        System.out.println("move");
        int[] is =       {0, 5, 0, 0, 4, 0, 2, 1, 2, 0};        
        Throwable exception = assertThrows(IllegalArgumentException.class, 
                () -> {InLine.move(is, 7, 0);});
        assertEquals("To many bals betweew to and from positions", 
                exception.getMessage());
    }
    
    @Test
    public void testMove_moreThan1balsonwayLeftToRight(){
        System.out.println("move");
        int[] is =       {0, 5, 0, 0, 4, 0, 2, 1, 2, 0};        
        Throwable exception = assertThrows(IllegalArgumentException.class, 
                () -> {InLine.move(is, 1, 9);});
        assertEquals("To many bals betweew to and from positions", 
                exception.getMessage());
    }
    
    
   
    /**
     * Test of remove3inline method, of class InLine.
     */
    @Test
    public void testRemove3inline_nothingtoremove() {
        System.out.println("remove3inline");
        int[] is = {0, 5, 0, 0, 4, 0, 2, 1, 2, 0};
        int[] expected = {0, 5, 0, 0, 4, 0, 2, 1, 2, 0};        
        InLine.remove3inline(is);
        assertArrayEquals(expected, is);
    }
 
    /**
     * Test of remove3inline method, of class InLine.
     */
    @Test
    public void testRemove3inline_nothingtoremovebut2() {
        System.out.println("remove3inline");
        int[] is = {0, 2, 2, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {0, 2, 2, 0, 0, 0, 0, 0, 0, 0};
        InLine.remove3inline(is);
        assertArrayEquals(expected, is);
    }
    
    /**
     * Test of remove3inline method, of class InLine.
     */
    @Test
    public void testRemove3inline_removemiddle() {
        System.out.println("remove3inline");
        int[] is = {0, 5, 0, 0, 4, 4, 4, 1, 2, 0};
        int[] expected = {0, 5, 0, 0, 0, 0, 0, 1, 2, 0};
        InLine.remove3inline(is);
        assertArrayEquals(expected, is);
    }
    
    /**
     * Test of remove3inline method, of class InLine.
     */
    @Test
    public void testRemove3inline_removebegin() {
        System.out.println("remove3inline");
        int[] is = {5, 5, 5, 0, 4, 0, 2, 1, 2, 0};
        int[] expected = {0, 0, 0, 0, 4, 0, 2, 1, 2, 0};        
        InLine.remove3inline(is);
        assertArrayEquals(expected, is);
    }
    
    /**
     * Test of remove3inline method, of class InLine.
     */
    @Test
    public void testRemove3inline_removeend() {
        System.out.println("remove3inline");
        int[] is = {0, 5, 0, 0, 4, 0, 2, 1, 1, 1};
        int[] expected = {0, 5, 0, 0, 4, 0, 2, 0, 0, 0};        
        InLine.remove3inline(is);
        assertArrayEquals(expected, is);
    }
    
    /**
     * Test of remove3inline method, of class InLine.
     */
    @Test
    public void testRemove3inline_dontcount0() {
        System.out.println("remove3inline");
        // ne compte pas les quatre 0 comme une suite valide
        int[] is = {0, 5, 0, 0, 0, 0, 2, 1, 1, 1};
        int[] expected = {0, 5, 0, 0, 0, 0, 2, 0, 0, 0};        
        InLine.remove3inline(is);
        assertArrayEquals(expected, is);
    }
}
