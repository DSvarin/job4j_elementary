package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);

        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Alexey Alekseev";
        names[3] = "Alexander Alexandrov";

        System.out.println("Имя в ячейке по индексу 0: " + names[0]);
        System.out.println("Имя в ячейке по индексу 1: " + names[1]);
        System.out.println("Имя в ячейке по индексу 2: " + names[2]);
        System.out.println("Имя в ячейке по индексу 3: " + names[3]);
    }
}
