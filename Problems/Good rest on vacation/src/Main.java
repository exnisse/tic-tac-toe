import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flight = scanner.nextInt();
        int hotelFee = scanner.nextInt();

        System.out.println(duration * foodCost + (duration - 1) * hotelFee + flight * 2);
    }
}