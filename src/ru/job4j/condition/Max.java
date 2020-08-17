package ru.job4j.condition;

public class Max {
    public static String max(int one, int two) {
        String result = one > two ? "One Is The Maximum Number" : "Two Is The Maximum Number";
        if (one > two) {
            result = "One Is The Maximum Number";
        }
        if (two > one) {
            result = "Two Is The Maximum Number";
        }
        return result;
    }
    public static int main(String[] args) {
        String msg = Max.max(10, 20);
        System.out.println(msg);
    }
}
