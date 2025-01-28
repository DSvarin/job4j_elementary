package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float actual = Converter.rubleToEuro(input);
        float delta = 0.0001f;

        assertEquals(expected, actual, delta);
    }

    @Test
    void whenConvert180RblThen3Dollar() {
        float input = 180;
        float expected = 3;
        float actual = Converter.rubleToDollar(input);
        float delta = 0.0001f;

        assertEquals(expected, actual, delta);
    }
}