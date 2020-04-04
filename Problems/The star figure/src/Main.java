import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dim = scanner.nextInt();
        int middle = dim / 2;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                char star = i == middle || j == middle || i == j || (i + 1) == (dim - j) ? '*' : '.';
                System.out.print(star + " ");
            }
            System.out.println("");
        }
    }
}