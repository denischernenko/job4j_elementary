package ru.job4j.condition;

public class DumbBot {
    public static String answer(String question) {
        String rsl = "That makes me puzzled. Let's try some other question.";
        if ("Hi, Bot.".equals(question)) {
            rsl = "Hi, smarty!";
        } else if ("Bye, see you.".equals(question)) {
            rsl = "Bye, see you soon!";
        }
        return rsl;
    }
    public static void main(String[] args) {
        String rsl = DumbBot.answer("Hi, Bot.");
        System.out.println(rsl);
        rsl = DumbBot.answer("Bye, see you.");
        System.out.println(rsl);
    }
}
