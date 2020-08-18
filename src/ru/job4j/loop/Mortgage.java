package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, int percent) {
        int year = 0;
        int loanDue = amount + ((amount) * (percent / 100));
        int balance = salary - loanDue;
        if (salary - (amount + ((amount) * (percent / 100))) < 0) {
            year = year + 1;
            salary = salary +
            return year;
        }
        if (balance > 0) {
            System.out.println("OK.");
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(100, 120, 50));
        System.out.println(Mortgage.year(1000, 120, 50));
    }
}