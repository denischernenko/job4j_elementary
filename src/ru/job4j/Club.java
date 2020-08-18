package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        boolean pass = hasMoney || beFriend;
        if (pass) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't go to the club.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}