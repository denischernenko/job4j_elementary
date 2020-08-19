package ru.job4j.array;

import javax.print.attribute.standard.PresentationDirection;

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
        System.out.println(FindLoop.indexOf(3, 3));
    }
}
