import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        int len = dimension * dimension;
        int[][] matrix = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        boolean solved = true;
        int total = 0;
        for (int i = 0; i < len; i++) {
            total += i + 1;
        }
        int sumVertical = 0;
        int sumHorizontal = 0;
        for (int i = 0; i < len; i++) {
            sumVertical = 0;
            sumHorizontal = 0;
            for (int j = 0; j < len; j++) {
                sumHorizontal += matrix[i][j];
                sumVertical += matrix[j][i];
            }
            if (sumVertical != total || sumHorizontal != total) {
                solved = false;
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                sum = 0;
                for (int k = 0; k < dimension; k++) {
                    for (int l = 0; l < dimension; l++) {
                        sum += matrix[i * dimension + k][j * dimension + l];
                    }
                }
                if (sum != total) {
                    solved = false;
                    break;
                }
            }
        }
        System.out.println(solved ? "YES" : "NO");
    }
}