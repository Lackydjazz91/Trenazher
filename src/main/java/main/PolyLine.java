package main;

import java.util.Arrays;

public class PolyLine {
    Point[] arr = new Point[6];

    PolyLine (Point[] arr) {
        this.arr = arr;
    }

    PolyLine () {}

    @Override
    public String toString() {
        return "Линия [" + Arrays.toString(arr) + "]";
    }

}
