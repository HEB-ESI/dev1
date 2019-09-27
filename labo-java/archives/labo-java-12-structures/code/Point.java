package esi.dev1.td12;

public class Point {
    int x;
    int y;

    public Point(int xValue, int yValue) {
        x = xValue;
        y = yValue;
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
