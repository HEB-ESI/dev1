package g12345.dev1.structure;

import org.junit.Assert;
import org.junit.Test;

public class HolidaysTest {
    
    @Test(expected = NullPointerException.class)
    public void testSortNull() {
        System.out.println("testSortNull");
        Holiday[] holidays = null;
        Holidays.sort(holidays);
    }
    
    @Test
    public void testSortEmpty() {
        System.out.println("testSortEmpty");
        Holiday[] holidays = {};
        Holidays.sort(holidays);
        Holiday[] expResults = {};
        Assert.assertArrayEquals(expResults, holidays);
    }

    @Test
    public void testSortNoSort() {
        System.out.println("testSortNoSort");
        Holiday[] holidays = {new Holiday(1, 1, 1, "1"),
            new Holiday(2, 2, 2, "2"),
            new Holiday(3, 3, 3, "3")};
        Holidays.sort(holidays);
        Holiday[] expResults = {new Holiday(1, 1, 1, "1"),
            new Holiday(2, 2, 2, "2"),
            new Holiday(3, 3, 3, "3")};
        boolean valid = false;
        int index = 0;
        while (!valid && index < holidays.length) {
            valid = holidays[index].label.equals(expResults[index].label);
            index++;
        }
        Assert.assertTrue(valid);
    }

    @Test
    public void testSort1Swap() {
        System.out.println("testSort1Swap");
        Holiday[] holidays = {new Holiday(2, 2, 2, "2"),
            new Holiday(1, 1, 1, "1"),
            new Holiday(3, 3, 3, "3"),
            new Holiday(10, 10, 10, "10")};
        Holidays.sort(holidays);
        Holiday[] expResults = {new Holiday(1, 1, 1, "1"),
            new Holiday(2, 2, 2, "2"),
            new Holiday(3, 3, 3, "3"),
            new Holiday(10, 10, 10, "10")};
        boolean valid = false;
        int index = 0;
        while (!valid && index < holidays.length) {
            valid = holidays[index].label.equals(expResults[index].label);
            index++;
        }
        Assert.assertTrue(valid);
    }

    @Test
    public void testSortAllSwap() {
        System.out.println("testSortAllSwap");
        Holiday[] holidays = {new Holiday(3, 3, 3, "3"),
            new Holiday(1, 1, 1, "1"),
            new Holiday(2, 2, 2, "2")};
        Holidays.sort(holidays);
        Holiday[] expResults = {new Holiday(1, 1, 1, "1"),
            new Holiday(2, 2, 2, "2"),
            new Holiday(3, 3, 3, "3")};
        boolean valid = false;
        int index = 0;
        while (!valid && index < holidays.length) {
            valid = holidays[index].label.equals(expResults[index].label);
            index++;
        }
        Assert.assertTrue(valid);
    }

    @Test
    public void testSortTwin() {
        System.out.println("testSortTwin");
        Holiday[] holidays = {new Holiday(2, 2, 2, "2"),
            new Holiday(1, 1, 1, "1"),
            new Holiday(3, 3, 3, "3"),
            new Holiday(1, 1, 1, "1")};
        Holidays.sort(holidays);
        Holiday[] expResults = {new Holiday(1, 1, 1, "1"),
            new Holiday(1, 1, 1, "1"),
            new Holiday(2, 2, 2, "2"),
            new Holiday(3, 3, 3, "3")};
        boolean valid = false;
        int index = 0;
        while (!valid && index < holidays.length) {
            valid = holidays[index].label.equals(expResults[index].label);
            index++;
        }
        Assert.assertTrue(valid);
    }

    @Test
    public void testSortIdentical() {
        System.out.println("testSortIdentical");
        Holiday[] holidays = {new Holiday(17, 14, 12, "2"),
            new Holiday(17, 14, 12, "2"),
            new Holiday(17, 14, 12, "2"),
            new Holiday(17, 14, 12, "2")};
        Holidays.sort(holidays);
        Holiday[] expResults = {new Holiday(17, 14, 12, "2"),
            new Holiday(17, 14, 12, "2"),
            new Holiday(17, 14, 12, "2"),
            new Holiday(17, 14, 12, "2")};
        boolean valid = false;
        int index = 0;
        while (!valid && index < holidays.length) {
            valid = holidays[index].label.equals(expResults[index].label);
            index++;
        }
        Assert.assertTrue(valid);
    }
}
