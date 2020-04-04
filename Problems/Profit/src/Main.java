import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        double sum = m;
        int years = 0;
        while (sum < k) {
            years++;
            sum *= 1.0 + (double)p / 100;
        }
        System.out.println(years);
    }
}