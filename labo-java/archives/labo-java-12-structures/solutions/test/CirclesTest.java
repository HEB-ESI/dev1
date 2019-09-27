package g12345.dev1.structure;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CirclesTest {

    @Test(expected = NullPointerException.class)
    public void testAreaNoCircle() {
        System.out.println("testAreaNoCircle");
        Circle c = null;
        Circles.area(c);
    }

    @Test
    public void testAreaAllNull() {
        System.out.println("testAreaNull");
        Circle c = new Circle(0, 0, 0);
        double expResult = 0.0;
        double result = Circles.area(c);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAreaRadiusNull() {
        System.out.println("testAreaRadiusNull");
        Circle c = new Circle(12, -4, 0);
        double expResult = 0.0;
        double result = Circles.area(c);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAreaPositif() {
        System.out.println("testAreaPositif");
        Circle c = new Circle(4, -7, 10);
        double expResult = 100 * Math.PI;
        double result = Circles.area(c);
        assertEquals(expResult, result, 0.0);
    }

    @Test(expected = NullPointerException.class)
    public void testPerimeterNoCircle() {
        System.out.println("testPerimeterNoCircle");
        Circle c = null;
        Circles.perimeter(c);
    }

    @Test
    public void testPerimeterAllNull() {
        System.out.println("perimeter");
        Circle c = new Circle(0, 0, 0);
        double expResult = 0.0;
        double result = Circles.perimeter(c);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testPerimeterRadiusNull() {
        System.out.println("perimeter");
        Circle c = new Circle(5, 8, 0);
        double expResult = 0.0;
        double result = Circles.perimeter(c);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testPerimeterPositif() {
        System.out.println("perimeter");
        Circle c = new Circle(2, -3, 15);
        double expResult = 30 * Math.PI;
        double result = Circles.perimeter(c);
        assertEquals(expResult, result, 0.0);
    }

    @Test(expected = NullPointerException.class)
    public void testMiddleCircleNoCircle() {
        System.out.println("testMiddleCircleNoCircle");
        Circle c1 = null;
        Circle c2 = null;
        Circles.middleCircle(c1, c2);
    }

    @Test
    public void testMiddleCircleSame() {
        System.out.println("testMiddleCircleSame");
        Circle c1 = new Circle(12, 4, 3);
        Circle c2 = new Circle(12, 4, 3);
        Circle expResult = new Circle(12, 4, 0);
        Circle result = Circles.middleCircle(c1, c2);
        assertEquals(expResult.center.xAxis, result.center.xAxis, 0.0);
        assertEquals(expResult.center.yAxis, result.center.yAxis, 0.0);
        assertEquals(expResult.radius, result.radius, 0.0);
    }

    @Test
    public void testMiddleCircleSameXaxis() {
        System.out.println("testMiddleCircleSameXaxis");
        Circle c1 = new Circle(12, 4, 3);
        Circle c2 = new Circle(12, 10, 3);
        Circle expResult = new Circle(12, 7, 3);
        Circle result = Circles.middleCircle(c1, c2);
        assertEquals(expResult.center.xAxis, result.center.xAxis, 0.0);
        assertEquals(expResult.center.yAxis, result.center.yAxis, 0.0);
        assertEquals(expResult.radius, result.radius, 0.0);
    }

    @Test
    public void testMiddleCircleSameYaxis() {
        System.out.println("testMiddleCircleSameYaxis");
        Circle c1 = new Circle(4, 10, 3);
        Circle c2 = new Circle(12, 10, 6);
        Circle expResult = new Circle(8, 10, 4);
        Circle result = Circles.middleCircle(c1, c2);
        assertEquals(expResult.center.xAxis, result.center.xAxis, 0.0);
        assertEquals(expResult.center.yAxis, result.center.yAxis, 0.0);
        assertEquals(expResult.radius, result.radius, 0.0);
    }

    @Test
    public void testMiddleCircleRandom() {
        System.out.println("testMiddleCircleRandom");
        Circle c1 = new Circle(11, 4, 3);
        Circle c2 = new Circle(14, 8, 6);
        Circle expResult = new Circle(12.5, 6, 2.5);
        Circle result = Circles.middleCircle(c1, c2);
        assertEquals(expResult.center.xAxis, result.center.xAxis, 0.0);
        assertEquals(expResult.center.yAxis, result.center.yAxis, 0.0);
        assertEquals(expResult.radius, result.radius, 0.0);
    }

    @Test(expected = NullPointerException.class)
    public void testIsADiskMemberNoCircle() {
        System.out.println("testIsADiskMemberNoCircle");
        Circle c = null;
        Point p = null;
        Circles.isADiskMember(c, p);
    }

    @Test
    public void testIsADiskMemberFalse() {
        System.out.println("testIsADiskMemberFalse");
        Circle c = new Circle(10, 4, 5);
        Point p = new Point(0, 0);
        boolean expResult = false;
        boolean result = Circles.isADiskMember(c, p);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsADiskMemberTrue() {
        System.out.println("testIsADiskMemberTrue");
        Circle c = new Circle(-1, 0, 5);
        Point p = new Point(0, 0);
        boolean expResult = true;
        boolean result = Circles.isADiskMember(c, p);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsADiskMemberLimit() {
        System.out.println("testIsADiskMemberLimit");
        Circle c = new Circle(10, 0, 5);
        Point p = new Point(5, 0);
        boolean expResult = false;
        boolean result = Circles.isADiskMember(c, p);
        assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testHaveIntersectionPointNoCircle() {
        System.out.println("testHaveIntersectionPointNoCircle");
        Circle c1 = null;
        Circle c2 = null;
        Circles.haveIntersectionPoint(c1, c2);
    }
    
    @Test
    public void testHaveIntersectionPointDisjoint() {
        System.out.println("testHaveIntersectionPointDisjoint");
        Circle circle1 = new Circle(0, 0, 3);
        Circle circle2 = new Circle(6, 0, 2);
        boolean expResult = false;
        boolean result = Circles.haveIntersectionPoint(circle1, circle2);
        assertEquals(expResult, result);
    }

    @Test
    public void testHaveIntersectionPointOne() {
        System.out.println("testHaveIntersectionPointOne");
        Circle c1 = new Circle(0, 0, 3);
        Circle c2 = new Circle(5, 0, 2);
        boolean expResult = true;
        boolean result = Circles.haveIntersectionPoint(c1, c2);
        assertEquals(expResult, result);
    }

    @Test
    public void testHaveIntersectionPointTwo() {
        System.out.println("testHaveIntersectionPointTwo");
        Circle c1 = new Circle(0, 0, 3);
        Circle c2 = new Circle(4, 0, 2);
        boolean expResult = true;
        boolean result = Circles.haveIntersectionPoint(c1, c2);
        assertEquals(expResult, result);
    }

    @Test
    public void testHaveIntersectionPointInclude() {
        System.out.println("testHaveIntersectionPointInclude");
        Circle circle1 = new Circle(0, 0, 5);
        Circle circle2 = new Circle(0, 1, 2);
        boolean expResult = false;
        boolean result = Circles.haveIntersectionPoint(circle1, circle2);
        assertEquals(expResult, result);
    }

}
