package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (n = 0; n <= 5; n++) {
            result = n * (n + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(0));
        System.out.println(calc(1));
        System.out.println(calc(5));
    }
}
