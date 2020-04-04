import  java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] mtx1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mtx1[i][j] = scanner.nextInt();
            }
        }
        int[][] mtx2 = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mtx2[j][n - i - 1] = mtx1[i][j];
            }
        }
        for (int[] vector : mtx2) {
            for (int val: vector) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}