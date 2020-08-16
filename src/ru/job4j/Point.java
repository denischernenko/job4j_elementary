package ru.job4j;

public class Point {

    public static double distance(double x1, double y1, double x2, double y2) {
        double x3 = x2 - x1;
        double y3 = y2 - y1;
        double x3sq = Math.pow(x3, 2);
        double y3sq = Math.pow(y3, 2);
        double c = x3sq + y3sq;
        double d = Math.sqrt(c);
        return d;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("The distance from (0,0) to (2,0) is " + result);
    }

}
