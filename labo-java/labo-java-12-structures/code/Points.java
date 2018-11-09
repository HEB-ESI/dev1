package esi.dev1.td12;

public class Points {
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2)
                + Math.pow(p1.y - p2.y, 2));
    }

    public static Point getMiddlePoint(Point p1, Point p2) {
        return new Point(
                p1.x + (p2.x - p1.x) / 2,
                p1.y + (p2.y - p1.y) / 2);
    }
}
