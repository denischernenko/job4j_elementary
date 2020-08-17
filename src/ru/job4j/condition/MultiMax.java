package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        boolean firstBiggerThanSecond = true;
        int result12 = firstBiggerThanSecond ? first : second;
        return result12;
        boolean secondBiggerThanThird = false;
        int result23 = secondBiggerThanThird ? second : third;
        return result23;
    }

    public static void main(String[] args) {
        String msg = MultiMax.max(1,2,3);
        System.out.println(msg);
}
}
