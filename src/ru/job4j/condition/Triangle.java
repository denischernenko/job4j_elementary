package ru.job4j.condition;

public class Triangle {

    public static void exist(double ab, double ac, double bc) {
        if ((ab + ac) > bc && (ac + bc) > ab && (bc + ab) > ac) {
            System.out.println("Triangle Is OK.");
        } else {
            System.out.println("Triangle Is Impossible.");
        }
    }

    public static void main(String[] args) {
        Triangle.exist(5.00, 12.00, 10.00);
        System.out.println("Такие Дела.");
    }
}