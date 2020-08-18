package ru.job4j.condition;

class AlertDivisionByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-15);
    }

    public static void possibleDiv(int number) {
        if (number > 0) {
            System.out.println("OK, that is possible to perform.");
        }
        if (number == 0) {
            System.out.println("No, we cannot divide by zero.");
        }
        if (number < 0) {
            System.out.println("This is negative number.");
        }
    }
}