package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterEvenTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = CounterEven.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    public void whenSumEvenNumbersFromOneToTenThenThirty2() {
        int rsl = CounterEven.sumByEven(1, 5);
        int expected = 6;
        assertThat(rsl, is(expected));
    }
}