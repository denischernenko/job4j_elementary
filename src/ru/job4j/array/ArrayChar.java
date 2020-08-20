package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < 4; index++) {
            if (word[index] == pref[index]) {
                result = true;
            } else result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[] {'T', 'a', 'l', 'k', 'o'};
        char[] pref = new char[] {'R', 'a', 'l', 'k'};
        System.out.println(ArrayChar.startsWith(word, pref));
    }
}
