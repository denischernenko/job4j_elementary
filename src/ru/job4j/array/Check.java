package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean[] array = new boolean[100]; // определяем сам массив с произвольным (?) размером
        boolean result = true; // определяем переменную результата сравнения
        array[0] = false; // определяем стартовую точку отсчёта, как рекомендовано по условию задачи
        for (int index = 0; index < array.length; index++) { // теперь, по идее стоит пройтись по каждому элементу и сравнить его с нулевым
            if (array[index] = true) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Check.mono(false)); // проверка метода с подстановкой пробных данных
    }
}
