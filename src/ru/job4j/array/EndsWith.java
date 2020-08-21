package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = word.length - post.length; index < word.length; index++) {
            if (word[index] != post.length) {
                result = true;
            } else result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[] {'P', 'r', 'i', 'v', 'i', 't'};
        char[] post = new char[] {'v', 'i', 't'};
        System.out.println(ArrayChar.startsWith(word, post));
    }
}

