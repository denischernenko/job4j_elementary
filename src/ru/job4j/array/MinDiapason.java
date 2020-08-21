package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[0];
        for (int index = start; index < finish; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[] {44, 3, 9, 12, 11, 44, 5, 33, 100, 1, 4};
        System.out.println(MinDiapason.findMin(array, 1 ,10));
    }
}