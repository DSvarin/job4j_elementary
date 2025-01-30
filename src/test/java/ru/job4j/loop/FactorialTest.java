package ru.job4j.loop;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void whenCalculate0Then1() {
        int input = 0;
        int expected = 1;
        int output = Factorial.calculate(input);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculate1Then1() {
        int input = 1;
        int expected = 1;
        int output = Factorial.calculate(input);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculate9Then362880() {
        int input = 9;
        int expected = 362880;
        int output = Factorial.calculate(input);

        assertThat(output).isEqualTo(expected);
    }

}