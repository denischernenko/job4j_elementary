package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el) {
        int result = 0; //if there is no such element in array
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 4, 8, 10, 19};
        System.out.println(FindLoop.indexOf(data, 3);
    }
}
