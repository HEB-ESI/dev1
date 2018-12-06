package g12345.dev1.structure;

/**
 * The Point structure represents a euclidian point with a x-axis and an y-axis
 * values.
 *
 * @author esiProf
 */
public class Point {

    /**
     * The x-axis value.
     */
    double xAxis;

    /**
     * The y-axis value.
     */
    double yAxis;

    /**
     * Constructs a point with a x-axis and an y-axis values.
     *
     * @param x the x-axis value.
     * @param y the y-axis value.
     */
    public Point(double x, double y) {
        xAxis = x;
        yAxis = y;
    }

    public String toString() {
        return "( " + String.format("%.2f", xAxis) + " , " + String.format("%.2f", yAxis) + " )";
    }

}
