package main;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point[] points = { new Point(0,0), new Point(3,0), new Point(3,4), new Point(0,4)};
            Line line = new Line(0,0,3,4);
            PolyLine polyLine = new PolyLine(points);
            ClosedPolyLine closedPolyLine = new ClosedPolyLine(points);

        System.out.println(line.getLength());
        System.out.println(polyLine.getLength());
        System.out.println(closedPolyLine.getLength());
    }
}