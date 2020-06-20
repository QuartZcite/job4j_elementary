package ru.job4j.array;
/**
 * Класс для проверки двухмерных массивов на моноряд.
 * @author DZN
 * @version 0.0
 */

public class MatrixCheck {
    /*** метод для проверки на горизонтальный моноряд */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    /*** метод для проверки на горизонтальный моноряд */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] iArray : board) {
            if (iArray[column] != 'X') {
                result = false;
                break;
            }
        }

        return result;
    }
    /*** метод для проверки на заполнение по диагонали */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }
    /*** метод для проверки на горизонтальный и вертикальный моноряд */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X') {
                result = (MatrixCheck.monoHorizontal(board, index) || MatrixCheck.monoVertical(board, index));
                if (result) {
                    break;
                }
            }
        }
        return result;
    }
}