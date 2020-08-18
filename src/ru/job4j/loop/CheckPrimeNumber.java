package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number % 2 == 0) {
            System.out.println("This Number Is Not Good " + number);
            return prime = false;
        }
        for (int index = 2; index <= number; index++) {
            if ((number % index) == 0) {
                System.out.println("This Number Is Not Prime " + number);
            }
                return prime = true;
        }
        return prime;
    }

    public static void main(String[] args) {
        CheckPrimeNumber.check(17);
        System.out.println(CheckPrimeNumber.check(15));

    }
}