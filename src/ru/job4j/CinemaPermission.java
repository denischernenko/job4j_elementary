package ru.job4j.condition;

public class CinemaPermission {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        boolean join = allowByParent && hasMoney;
        if ( join = true ) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't go to the cinema.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}