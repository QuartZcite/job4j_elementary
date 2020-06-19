package ru.job4j.array;
// тест на горизонтальный ряд
public class MatrixCheck {
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
// тест на вертикальный ряд
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
// заполнение из диагонали матрицы
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }
// тест на комбинацию в сокобан (6,4,7)
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