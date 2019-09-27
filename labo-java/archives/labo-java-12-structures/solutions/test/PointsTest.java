package g12345.dev1.structure;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PointsTest {

    @Test(expected = NullPointerException.class)
    public void testDistanceNoPoint() {
        System.out.println("testDistanceNoPoint");
        Point p1 = null;
        Point p2 = null;
        Points.distance(p1, p2);
    }

    @Test
    public void testDistanceZero() {
        System.out.println("testDistanceZero");
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        double expResult = 0.0;
        double result = Points.distance(p1, p2);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testDistanceSameX() {
        System.out.println("testDistanceSameX");
        Point p1 = new Point(10, 0);
        Point p2 = new Point(10, 14);
        double expResult = 14.0;
        double result = Points.distance(p1, p2);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testDistanceSameY() {
        System.out.println("testDistanceSameY");
        Point p1 = new Point(-8, 4);
        Point p2 = new Point(4, 4);
        double expResult = 12.0;
        double result = Points.distance(p1, p2);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testDistanceRandom() {
        System.out.println("testDistanceRandom");
        Point p1 = new Point(-3, 4);
        Point p2 = new Point(0, 8);
        double expResult = 5.0;
        double result = Points.distance(p1, p2);
        assertEquals(expResult, result, 0.0);
    }

    @Test(expected = NullPointerException.class)
    public void testMiddlePointNoPoint() {
        System.out.println("testMiddlePointNoPoint");
        Point p1 = null;
        Point p2 = null;
        Points.middlePoint(p1, p2);
    }

    @Test
    public void testMiddlePointSame() {
        System.out.println("testMiddlePointSame");
        Point p1 = new Point(10, 14);
        Point p2 = new Point(10, 14);
        Point expResult = new Point(10, 14);
        Point result = Points.middlePoint(p1, p2);
        assertEquals(expResult.xAxis, result.xAxis, 0.0);
        assertEquals(expResult.yAxis, result.yAxis, 0.0);
    }

    @Test
    public void testMiddlePointSameX() {
        System.out.println("testMiddlePointSameX");
        Point p1 = new Point(5, 22);
        Point p2 = new Point(5, 42);
        Point expResult = new Point(5, 32);
        Point result = Points.middlePoint(p1, p2);
        assertEquals(expResult.xAxis, result.xAxis, 0.0);
        assertEquals(expResult.yAxis, result.yAxis, 0.0);
    }

    @Test
    public void testMiddlePointSameY() {
        System.out.println("testMiddlePointSameY");
        Point p1 = new Point(2, -5);
        Point p2 = new Point(12, -5);
        Point expResult = new Point(7, -5);
        Point result = Points.middlePoint(p1, p2);
        assertEquals(expResult.xAxis, result.xAxis, 0.0);
        assertEquals(expResult.yAxis, result.yAxis, 0.0);
    }

    @Test
    public void testMiddlePointRandom() {
        System.out.println("testMiddlePointRandom");
        Point p1 = new Point(20, 1);
        Point p2 = new Point(-40, 9);
        Point expResult = new Point(-10, 5);
        Point result = Points.middlePoint(p1, p2);
        assertEquals(expResult.xAxis, result.xAxis, 0.0);
        assertEquals(expResult.yAxis, result.yAxis, 0.0);
    }
}
