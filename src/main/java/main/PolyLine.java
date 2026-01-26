package main;

import java.util.Arrays;

public class PolyLine {
    Point[] points = new Point[6];

    PolyLine() {
    }

    PolyLine(Point[] arr) {
        this.points = arr;
    }

    public Point[] getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Линия " + Arrays.toString(points) + "";
    }

    public Line[] getLines() {
        if (points.length < 2) {
            return new Line[0];
        }
        Line[] lines = new Line[points.length - 1];

        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i + 1]);
        }

        return lines;
    }

    public double getLength() {
        Line[] lines = getLines();
        double totalLength = 0.0;

        for (int i = 0; i < lines.length; i++) {
            totalLength = totalLength + lines[i].getLength();
        }

        return totalLength;
    }


}
