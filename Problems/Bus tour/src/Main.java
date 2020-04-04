import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        boolean crash = false;
        int passing = 0;
        while (passing < bridges) {
            passing++;
            int height = scanner.nextInt();
            if (height <= busHeight) {
                System.out.println("Will crash on bridge " + passing);
                crash = true;
                break;
            }
        }

        if (crash) {
            return;
        }
        System.out.println("Will not crash");
    }
}