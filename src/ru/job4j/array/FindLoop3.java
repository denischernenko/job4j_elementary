package ru.job4j.array;

public class FindLoop3 {

    public static int indexOf(int[] data, int el) {
        int result = -1; //if there is no such element in array
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = new int[] {1, 4, 8, 10, 19, 20, 55};
        System.out.println(FindLoop3.indexOf(data, 55));
    }
}
