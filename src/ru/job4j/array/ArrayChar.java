package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            } else result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[] {'R', 'a', 'l', 'g', 'o'};
        char[] pref = new char[] {'R', 'a', 'l', 'g'};
        System.out.println(ArrayChar.startsWith(word, pref));
    }
}
