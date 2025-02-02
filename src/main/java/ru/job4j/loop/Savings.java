package ru.job4j.loop;

public class Savings {

    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        double annualMultiplier = 1 + percent / 100;
        do {
            total = total * annualMultiplier + annualDeposit;
            years++;
        } while (total < goal);
        return years;
    }
}
