package g12345.dev1.structure;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DatesTest {

    @Test(expected = NullPointerException.class)
    public void testCompareNoDate() {
        System.out.println("testCompareNoDate");
        Date d1 = null;
        Date d2 = null;
        Dates.compare(d1, d2);
    }

    @Test
    public void testCompareSame() {
        System.out.println("testCompareSame");
        Date d1 = new Date(14, 10, 1986);
        Date d2 = new Date(14, 10, 1986);
        int expResult = 0;
        int result = Dates.compare(d1, d2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareAfter1Year() {
        System.out.println("testCompareAfter1Year");
        Date d1 = new Date(12, 3, 1456);
        Date d2 = new Date(12, 3, 1455);
        int expResult = 1;
        int result = Dates.compare(d1, d2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareAfter1Month() {
        System.out.println("testCompareAfter1Month");
        Date d1 = new Date(1, 7, 1033);
        Date d2 = new Date(1, 6, 1033);
        int expResult = 1;
        int result = Dates.compare(d1, d2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareAfter1Day() {
        System.out.println("testCompareAfter1Day");
        Date d1 = new Date(14, 8, 987);
        Date d2 = new Date(13, 8, 987);
        int expResult = 1;
        int result = Dates.compare(d1, d2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareBefore1Year() {
        System.out.println("testCompareBefore1Year");
        Date d1 = new Date(22, 9, 1875);
        Date d2 = new Date(22, 9, 1876);
        int expResult = -1;
        int result = Dates.compare(d1, d2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareBefore1Month() {
        System.out.println("testCompareBefore1Month");
        Date d1 = new Date(10, 7, 123);
        Date d2 = new Date(10, 8, 123);
        int expResult = -1;
        int result = Dates.compare(d1, d2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareBefore1Day() {
        System.out.println("testCompareBefore1Day");
        Date d1 = new Date(27, 2, 1298);
        Date d2 = new Date(28, 2, 1298);
        int expResult = -1;
        int result = Dates.compare(d1, d2);
        assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCompareBeforeBC() {
        System.out.println("testCompareBeforeBC");
        Date d1 = new Date(28, 2, -484);
    }

}
