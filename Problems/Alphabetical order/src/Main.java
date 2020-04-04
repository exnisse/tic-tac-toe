import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        String[] values = in.split(" ");

        boolean ordered = true;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i].compareTo(values[i + 1]) > 0) {
                ordered = false;
                break;
            }
        }
        System.out.println(ordered);
    }
}