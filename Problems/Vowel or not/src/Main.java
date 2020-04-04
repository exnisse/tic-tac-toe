import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);
        char[] vowels = {'a', 'i', 'u', 'e', 'o'};
        for (char vowel : vowels) {
            if (vowel == lowerCh) {
                return true;
            }
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}