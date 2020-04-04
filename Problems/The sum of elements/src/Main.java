import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int read = scanner.nextInt();
            if (read == 0) {
                break;
            }
            sum += read;
        }
        System.out.println(sum);
    }
}