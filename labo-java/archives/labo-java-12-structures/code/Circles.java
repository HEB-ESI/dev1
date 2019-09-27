package esi.dev1.td12;

public class Circles {
    public static boolean haveAnIntersectionPoint(Circle c1, Circle c2) {
        double centersDistance = Points.distance(c1.center, c2.center);

        return  centersDistance <= c2.radius + c1.radius
                && Math.abs(c2.radius - c1.radius) >= centersDistance;
    }

    public static double diskArea(Circle circle) {
        return Math.PI * Math.pow(circle.radius, 2);
    }

    public static Circle centeredCircle(Circle c1, Circle c2) {
        Point center = Points.getMiddlePoint(c1.center, c2.center);
        double radius = Points.distance(c1.center, c2.center) / 2;

        return new Circle(radius, center);
    }

    public static boolean isADiskMember(Circle c, Point p) {
        return Points.distance(c.center, p) <= c.radius;
    }
}
