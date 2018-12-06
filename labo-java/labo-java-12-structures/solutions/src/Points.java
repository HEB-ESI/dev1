package g12345.dev1.structure;

/**
 * Utility class for Point.
 *
 * @author esiProf
 */
public class Points {

    /**
     * Return the distance between two points.
     *
     * @param point1 first point.
     * @param point2 second point.
     * @return the distance between two points.
     */
    static double distance(Point point1, Point point2) {
        double deltaX = point1.xAxis - point2.xAxis;
        double deltaY = point1.yAxis - point2.yAxis;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    /**
     * Return the middle point between two points.
     *
     * @param point1 first point.
     * @param point2 second point.
     * @return the middle point between two points.
     */
    static Point middlePoint(Point point1, Point point2) {
        double midX = (point1.xAxis + point2.xAxis) / 2;
        double midY = (point1.yAxis + point2.yAxis) / 2;
        return new Point(midX, midY);
    }
}
