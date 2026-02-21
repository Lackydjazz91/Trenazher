package main;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] grades = new int[]{3,4,5,5,5,5,5,5};
        Student s = new Student("Mark", grades);
        s.addGrades(5);
        int[] valueGrades = s.getGrades();
        System.out.println(Arrays.toString(valueGrades));
    }
}