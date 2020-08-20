package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, int percent) {
        int year = 0;
        while (amount > 0) {
            amount += amount * percent / 100;
            amount -= salary;
            year += 1;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(100, 120, 50));
        System.out.println(Mortgage.year(200, 120, 50));
        System.out.println(Mortgage.year(300, 220, 50));
    }
}