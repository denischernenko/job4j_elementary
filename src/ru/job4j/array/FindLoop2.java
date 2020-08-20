package ru.job4j.array;

public class FindLoop2 {

    public static int indexOf2(int[] data, int el, int start, int finish) {
        int result = -1; //if there is no such element in array
        for (int index = start; index < finish + 1; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = new int[] {1, 4, 8, 10, 19, 20, 55};
        System.out.println(FindLoop2.indexOf2(data, 55, 1, 7));
    }
}
