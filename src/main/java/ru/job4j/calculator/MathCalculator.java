package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double sumOperationsResults(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                    + subtract(first, second)
                        + divide(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы операций сложение и умножение чисел 10 и 20 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы операций вычитание и деление чисел 30 и 15 равен: " + subtractAndDivide(30, 15));
        System.out.println("Результат расчета суммы операций сложение, вычитание, умножение и деление"
                + " чисел 20 и 5 равен: " + sumOperationsResults(10, 20));
    }
}