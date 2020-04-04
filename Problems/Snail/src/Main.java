import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();

        int days = 1;
        int total = up;
        while (total < height)  {
            total += up - down;
            days++;
        }
        System.out.println(days);
    }
}