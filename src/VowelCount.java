import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class VowelCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        long vowelCount = input.chars()
                .mapToObj(c -> (char) c)
                .filter(vowels::contains)
                .count();

        Predicate<Character> isAlphabet = c -> c >= 'a' && c <= 'z';
        long consonantCount = input.chars()
                .mapToObj(c -> (char) c)
                .filter(isAlphabet.and(c -> !vowels.contains(c)))
                .count();

        System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);
    }
}