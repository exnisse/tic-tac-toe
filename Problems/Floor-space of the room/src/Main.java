import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double area = 0d;
        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                break;
            case "rectangle":
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                area = x * y;
                break;
            case "circle":
                double r = scanner.nextDouble();
                area = 3.14 * r * r;
                break;
        }
        System.out.println(area);
    }
}