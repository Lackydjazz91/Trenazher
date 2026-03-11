package main;

public class ClosedPolyLine extends PolyLine implements Measurable {

    ClosedPolyLine(Point[] arr) {
        super(arr);
    }

    @Override
    public double getLength() {
        double length = super.getLength();

        if(points.length >= 2) {
            int lastPoint = points.length-1;
            int dx = points[lastPoint].x - points[0].x;
            int dy = points[lastPoint].y - points[0].y;
            length += Math.sqrt(dx * dx + dy * dy);
        }
        return length;
    }
}
