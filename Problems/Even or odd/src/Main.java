import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            var num = scanner.nextLine();
            int val = Integer.parseInt(num);
            if (val == 0) break;
            System.out.println(val % 2 == 0 ? "even" : "odd");
        }
    }
}