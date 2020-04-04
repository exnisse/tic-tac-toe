import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int[] numbers = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxnum = 0;
        for (int j = 0; j < numElements; j++) {
            if (numbers[j] % 4 == 0 && numbers[j] > maxnum) {
                maxnum = numbers[j];
            }
        }
        System.out.println(maxnum);
    }
}