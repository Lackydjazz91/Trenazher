package main;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;
    private int size = 0;

    public Student(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Имя не может быть null");
        }
        this.name = name;
        this.grades = new int[10];
        this.size = 0;
    }

    public Student(String name, int[] initialGrades) {
        this(name);
        if (initialGrades != null) {
            for (int i = 0; i < initialGrades.length; i++) {
                if (initialGrades[i] < 2 || initialGrades[i] > 5) {
                    throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
                }
            }
            this.grades = new int[Math.max(initialGrades.length * 2, 10)];
            for (int i = 0; i < initialGrades.length; i++) {
                this.grades[i] = initialGrades[i];
            }
            this.size = initialGrades.length;
        } else {
            this.grades = new int[10];
            this.size = 0;
        }
    }

    public void addGrades(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
        }
        if (size == grades.length) {
            int[] newGrades = new int[grades.length * 2];
            for (int i = 0; i < grades.length; i++) {
                newGrades[i] = grades[i];
            }
            grades = newGrades;
        }

        grades[size] = grade;
        size++;

    }

    public int[] getGrades() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = grades[i];
        }
        return result;
    }

    @Override
    public String toString() {
        int[] currentGrades = getGrades();
        return name + ": " + Arrays.toString(currentGrades);
    }
}
