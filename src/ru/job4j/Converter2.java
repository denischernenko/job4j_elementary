package ru.job4j.converter;

public class Converter2 {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter2.rubleToEuro(140);
        int dollar = Converter2.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " euro.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 140;
        expected = 2;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}