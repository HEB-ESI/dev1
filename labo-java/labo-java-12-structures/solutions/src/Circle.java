package g12345.dev1.structure;

/**
 * The Circle structure represents a classic circle.
 *
 * @author esiProf
 */
public class Circle {

    /**
     * The center of the circle.
     */
    Point center;

    /**
     * The radius of the circle.
     */
    double radius;

    /**
     * Constructs a Circle.
     *
     * @param x x-axis of the center.
     * @param y yaxis of the center.
     * @param aRadius radius ofthe circle.
     */
    public Circle(double x, double y, double aRadius) {
        center = new Point(x, y);
        radius = aRadius;
    }

    /**
     * Constructs a Circle.
     *
     * @param aCenter center of the circle.
     * @param aRadius radius ofthe circle.
     *
     * @throws IllegalArgumentException if the center is null.
     */
    public Circle(Point aCenter, double aRadius) {
        if (aCenter == null) {
            throw new IllegalArgumentException("Aucun centre donné en paramètre");
        }
        center = aCenter;
        radius = aRadius;
    }

    public String toString() {
        return "Cercle de rayon " + radius + " et de centre " + center;
    }

}
