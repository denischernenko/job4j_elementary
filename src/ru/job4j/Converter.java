package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(double value) {
        double euro = value / 70;
        return euro;
    }

    public static double rubleToDollar(double value) {
        double dollar = value / 60; /* формула перевода рублей в доллары. */
        return dollar;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles is " + euro + " euros.");
        System.out.println("140 rubles is " + dollar + " dollars.");
    }
}