package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public static boolean whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
        System.out.println("Tested OK");
    }

    public static boolean whenDoesNotExist() {
        boolean result = Triangle.exist(2.0, 5.0, 200.0);
        assertThat(result, is(false));
        System.out.println("Tested Failed");
    }
}