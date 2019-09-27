package g12345.dev1.structure;

/**
 * Utility class for Circle.
 *
 * @author esiProf
 */
public class Circles {

    /**
     * Return the area of a circle.
     *
     * @param circle circle to mesure.
     * @return the area of a circle.
     */
    static double area(Circle circle) {
        return Math.PI * circle.radius * circle.radius;
    }

    /**
     * Return the perimeter of a circle.
     *
     * @param circle circle to mesure.
     * @return the perimeter of a circle.
     */
    static double perimeter(Circle circle) {
        return 2 * Math.PI * circle.radius;
    }

    /**
     * Return a circle whose diameter is the segment connecting the centers of
     * the circles given in parameter.
     *
     * @param circle1 first circle.
     * @param circle2 second circle.
     * @return a circle whose diameter is the segment connecting the centers of
     * the circles given in parameter.
     */
    static Circle middleCircle(Circle circle1, Circle circle2) {
        double diamètre = Points.distance(circle1.center, circle2.center);
        Point centre = Points.middlePoint(circle1.center, circle2.center);
        return new Circle(centre, diamètre / 2);
    }

    /**
     * Return true if a point is in the circle (without border) and false
     * elsewhere.
     *
     * @param circle the circle.
     * @param point the point.
     * @return true if a point is in the circle (without border) and false
     * elsewhere.
     */
    static boolean isADiskMember(Circle circle, Point point) {
        return Points.distance(point, circle.center) < circle.radius;
    }

    /**
     * Returns true if two circles have an intersection point and false
     * elsewhere.
     *
     * @param circle1 first circle.
     * @param circle2 second circle.
     * @return true if two circles have an intersection point and false
     * elsewhere.
     */
    static boolean haveIntersectionPoint(Circle circle1, Circle circle2) {
        double distance = Points.distance(circle1.center, circle2.center);
        double deltaRadius = circle1.radius - circle2.radius;
        double sumRadius = circle1.radius + circle2.radius;
        return (deltaRadius <= distance)
                && (sumRadius >= distance);
    }
}
