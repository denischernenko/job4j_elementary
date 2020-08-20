package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index == 2; index++) {
            if (word[index] == pref[index]) {
            result = true;
            } else result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'G', 'o', 'o', 'd'};
        boolean result = ArrayChar.startsWith(word, pref);
            System.out.println(result);
    }
}
