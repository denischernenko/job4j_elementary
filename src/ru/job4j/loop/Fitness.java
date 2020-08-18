package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            month = 1;
            ivan = 90 * month;
            nik = 100 * month;
            month += 1;
            ivan *= 3;
        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println(Fitness.calc(90, 100));
    }
}
