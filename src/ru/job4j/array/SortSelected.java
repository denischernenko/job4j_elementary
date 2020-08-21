package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int start = 0; start < data.length; start++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop2.indexOf2(data, min, 0, data.length);
            data[min] = data[index];
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = new int[] {1, 5, 11, 44, 100, 23, 13, 4, 2};
        System.out.println(SortSelected.sort(data));
    }
}
