package ru.job4j.loop;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CounterTest {

    @Test
    void whenSum0To5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSum10To40Then775() {
        int start = 10;
        int finish = 40;
        int expected = 775;
        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSum30To15Then0() {
        int start = 30;
        int finish = 15;
        int expected = 0;
        int output = Counter.sum(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEven0To10() {
        int start = 0;
        int finish = 10;
        int expected = 30;
        int output = Counter.sumByEven(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEven30To10() {
        int start = 30;
        int finish = 10;
        int expected = 0;
        int output = Counter.sumByEven(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenMinus15To2() {
        int start = -15;
        int finish = 2;
        int expected = -54;
        int output = Counter.sumByEven(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenMinus20ToMinus5() {
        int start = -20;
        int finish = -5;
        int expected = -104;
        int output = Counter.sumByEven(start, finish);

        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenMinus10ToMinus30() {
        int start = -10;
        int finish = -30;
        int expected = 0;
        int output = Counter.sumByEven(start, finish);

        assertThat(output).isEqualTo(expected);
    }
}