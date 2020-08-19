package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, int percent) {
        int year = 0;
        while ((salary - amount * percent / 100) < 0) {
            amount += amount * percent / 100;
            amount -= salary;
            year += 1;
            return year;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(100, 120, 50));
        System.out.println(Mortgage.year(1000, 120, 50));
    }
}