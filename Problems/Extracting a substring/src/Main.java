import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int startAt = scanner.nextInt();
        int endAt = scanner.nextInt();

        System.out.println(word.substring(startAt, ++endAt));
    }
}