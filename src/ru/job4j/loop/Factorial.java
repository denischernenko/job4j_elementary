package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int index = 1; index <= n; index++) {
            result = result * index;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(0));
        System.out.println(calc(1));
        System.out.println(calc(2));
        System.out.println(calc(3));
        System.out.println(calc(4));
        System.out.println(calc(5));
    }
}
