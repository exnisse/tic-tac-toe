import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int last = numbers[size - 1];
        for (int i = size - 1; i >= 0; i--) {
            if (i == 0) {
                numbers[i] = last;
            } else {
                numbers[i] = numbers[i - 1];
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]);
            if (i < size - 1) {
                System.out.print(" ");
            }
        }
    }
}