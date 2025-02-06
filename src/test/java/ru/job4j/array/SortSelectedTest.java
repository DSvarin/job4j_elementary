package ru.job4j.array;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayFrom3() {
        int[] data = new int[] {50, 10, 40};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 40, 50};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayFrom5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayFromNegativeNumbers() {
        int[] data = new int[] {-3, -4, -1, -2, -5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-5, -4, -3, -2, -1};
        assertThat(result).containsExactly(expected);
    }
}