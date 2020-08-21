package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 'X') {
                result = false;
                break;
            }
        }
    return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'X', 'i', 't'},
                {'X', 'X', 'X'},
                {'X', 'e', 't'}
        };
        System.out.println("Только ли элементы Х в данной строке: " + MatrixCheck.monoHorizontal(board, 0));
        System.out.println("Только ли элементы Х в данном столбце: " + MatrixCheck.monoVertical(board, 0));

    }
}
