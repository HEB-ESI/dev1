package esi.dev1.td12;

public class Circle {
    double radius;
    Point center;

    Circle(double aRadius, Point aCenter) {
        radius = aRadius;
        center = aCenter;
    }

    public String toString() {
        return "Center : " + center + "; radius : " + radius;
    }
}
