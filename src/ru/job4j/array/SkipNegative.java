package ru.job4j.array;

public class SkipNegative {

    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array.length; cell++) {
                int value = array[row][cell];
                if (value < 0) {
                    value = 0;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, -2, -4},
                {3, 9, -3},
                {-9, 3, 2}
        };
        System.out.println(SkipNegative.skip(array));
    }
}
