package main;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Point t1 = new Point(1, 5);
        Point t2 = new Point(2, 8);
        Point t3 = new Point(5, 3);
        Point t4 = new Point(8, 9);

        Point[] points = new Point[]{t1, t2, t3, t4};

        PolyLine polyLine = new PolyLine(points);//Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        System.out.println("Ломаная: " + polyLine);

        double polyLineLength = polyLine.getLength(); // Рассчитать длину Ломаной
        System.out.println("Длина ломаной: " + polyLineLength);

        Line[] arrLines = polyLine.getLines();// Получить у Ломаной массив Линий
        System.out.println("Количество линий в ломаной: " + arrLines.length);

        double lengthArrLines = 0.0; // Рассчитать длину массива Линий
        for (int i = 0; i < arrLines.length; i++) {
            lengthArrLines = lengthArrLines + arrLines[i].getLength();
        }
        System.out.println("Сумма всех линий " + lengthArrLines);

        System.out.println(polyLine.getLength() == lengthArrLines); // Сравнить длину Ломаной и массива Линий: они должны совпасть

        System.out.println("Старые координаты точки: " + t2);
        System.out.println("Старые данные по ломаной: " + polyLine);
        System.out.println("Массив линий до изменения: ");
        for (int i = 0; i < arrLines.length; i++) {
            System.out.println(arrLines[i]);
        }

        t2.setX(12); // Изменить координаты Точки {2,8} (поменяли только x т.к. y значение не меняет)

        System.out.println("Новые координаты точки: " + t2);
        System.out.println("Новые данные по ломаной: " + polyLine);
        System.out.println("Массив линий после изменения: ");
        for (int i = 0; i < arrLines.length; i++) {
            System.out.println(arrLines[i]);
        }

    }
}