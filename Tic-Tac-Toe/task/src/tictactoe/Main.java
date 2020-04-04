package tictactoe;

import java.util.Scanner;

public class Main {
    static int dimension = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter Cells: ");
        // String state = scanner.nextLine();
        String state = "_________";
        char player = 'X';
        char[][] matrix = initializeMatrix(state);
        printMatrix(matrix);
        boolean isFinished = false;
        while (!isFinished) {
            System.out.print("Enter the coordinates: ");
            boolean gotValidValues = false;
            while (!gotValidValues) {
                String coordinateX = scanner.next();
                String coordinateY = scanner.next();
                gotValidValues = setMatrix(matrix, coordinateX, coordinateY, player);
            }
            printMatrix(matrix);
            player = player == 'X' ? 'O' : 'X';
            isFinished = gameFinished(matrix);
        }
    }
    private static char[][] initializeMatrix(String state) {
        char[][] matrix = new char[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                char val = state.charAt(i * dimension + j);
                if (val == '_') {
                    val = ' ';
                }
                matrix[i][j] = val;
            }
        }
        return matrix;
    }
    private static boolean setMatrix(char[][] matrix, String coordinateX, String coordinateY, char player) {
        if (!isInteger(coordinateX) || !isInteger(coordinateY)) {
            System.out.println("You should enter numbers!");
            return false;
        }
        int x = Integer.parseInt(coordinateX);
        int y = Integer.parseInt(coordinateY);
        if (x < 1 || x > 3 || y < 1 || y > 3) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        }
        if (matrix[dimension - y][x - 1] == 'O' || matrix[dimension - y][x - 1] == 'X') {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }
        matrix[dimension - y][x - 1] = player;
        return true;
    }
    private static void printMatrix(char[][] matrix) {
        System.out.println("---------");
        for (int i = 0; i < dimension; i++) {
            System.out.print("| ");
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
    private static boolean gameFinished(char[][] matrix) {
        int _Count = 0;
        for (char[] vector : matrix) {
            for (char val : vector) {
                if (val == '_' || val == ' ') {
                    _Count++;
                }
            }
        }
        boolean xWin = false;
        boolean oWin = false;
        int xCount = 0;
        int oCount = 0;
        char[] players = {'X', 'O'};
        for (char me : players) {
            int count = 0;
            int diag = 0;
            int nDiag = 0;
            for (int i = 0; i < dimension; i++) {
                int row = 0;
                int column = 0;
                for (int j = 0; j < dimension; j++) {
                    if (matrix[i][j] == me) {
                        count++;
                        row++;
                    }
                    if (matrix[j][i] == me) {
                        column++;
                    }
                    if (i == j && matrix[i][j] == me) {
                        diag++;
                    }
                    if ((i + 1) == (dimension - j) && matrix[i][j] == me) {
                        nDiag++;
                    }
                }
                if (row == dimension || column == dimension) {
                    if (me == 'X') {
                        xWin = true;
                    } else {
                        oWin = true;
                    }
                }
            }
            if (diag == dimension || nDiag == dimension) {
                if (me == 'X') {
                    xWin = true;
                } else {
                    oWin = true;
                }
            }
            if (me == 'X') {
                xCount = count;
            } else {
                oCount = count;
            }
        }

        if ((xWin && oWin) || xCount - oCount > 1 || oCount -xCount > 1) {
            System.out.println("Impossible");
        } else if (!xWin && !oWin && _Count > 0) {
            return false;   // System.out.println("Game not finished");
        } else if (!xWin && !oWin && _Count == 0) {
            System.out.println("Draw");
        } else if (xWin) {
            System.out.println("X wins");
        } else if (oWin) {
            System.out.println("O wins");
        }
        return true;
    }
    public static boolean isInteger(String s) {
        return isInteger(s,10);
    }

    public static boolean isInteger(String s, int radix) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1)
                    return false;
                else
                    continue;
            }
            if (Character.digit(s.charAt(i), radix) < 0) return false;
        }
        return true;
    }
}
