package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                // Условие проверки Пробел/X
                // Закономерность для печати X: чётность суммы координат клетки
                if ((row + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            // Перевод на новую строку, чтобы отделить одну псевдографику от другой
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
        System.out.println();
        paint(5, 5);
    }
}
