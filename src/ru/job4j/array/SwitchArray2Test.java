package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArray2Test {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {4, 2, 3, 1, 5, 6};
        int[] rsl = SwitchArray2.swap(input, 0, 3);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {1, 3, 2, 4, 5, 6};
        int[] rsl = SwitchArray2.swap(input, 1, 2);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap4to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {1, 2, 3, 4, 6, 5};
        int[] rsl = SwitchArray2.swap(input, 4, 5);
        assertThat(rsl, is(expect));
    }
}