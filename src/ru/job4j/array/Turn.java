package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        for (int index = 0; index < array.length - index; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] reverse = new int[] {1, 100, 3, 4, 5, 6, 7, 8, 300, 10};
        int[] rsl = Turn.back(reverse);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
