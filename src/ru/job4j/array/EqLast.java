package ru.job4j.array;

public class EqLast {

    public static boolean check(int[] left, int[] right) {
        if (left[left.length - 1] == right[right.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] left = new int[] {0, 1, 7, 2, 5, 100};
        int[] right = new int[] {0, 1, 2, 5, 100};
        System.out.println(EqLast.check(left, right));
    }
}
