import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prev = 0;
        int current = 0;
        boolean ordered = true;
        int prevDiff = 0;
        int currentDiff = 0;
        int count = 0;
        while (scanner.hasNextInt()) {
            count++;
            prev = current;
            current = scanner.nextInt();
            if (current == 0) {
                break;
            }
            if (count > 1) {
                prevDiff = currentDiff;
                currentDiff = current - prev;
            }
            if (prevDiff > 0 && currentDiff < 0 || prevDiff < 0 && currentDiff > 0) {
                ordered = false;
                break;
            }
        }
        System.out.println(ordered);
    }
}