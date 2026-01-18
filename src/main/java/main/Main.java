package main;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Line l1 = new Line(1, 3, 5, 8);
        Line l2 = new Line(10, 11, 15, 19);
        Line l3 = new Line(l1.getEnd(), l2.getStart());


        // 1. Выведите текстовое представление Линии 3 на экран
        System.out.println(l3);

        // 2. Измените координаты точек начала и конца Линии 3 таким образом, чтобы изменились все три объекта Линии
        l3.getStart().setX(40);
        l3.getStart().setY(96);
        l3.getEnd().setX(120);
        l3.getEnd().setY(212);


        // 3. Выведите текстовое представление Линии 3 на экран после изменения её состояния
        System.out.println(l3);

        // 4. Рассчитайте суммарную длину всех трех линий и выведите её на экран

        double a = l1.getLength();
        double b = l2.getLength();
        double c = l3.getLength();

        double x = a + b + c;

        System.out.println("Cуммарная длина всех трех линий = " + x);

    }
}