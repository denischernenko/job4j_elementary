package ru.job4j.array;

public class MatrixSum {

    public static int sum(int[][] array) {
        int result = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array.length; cell++) {
                int value = array[row][cell];
                    result = result + value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {
                {4, 2, 3},
                {7, 1, 5},
                {3, 5, 6}
        };
        System.out.println(MatrixSum.sum(array));
    }
}
