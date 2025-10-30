/*Write a simple Java program to check if a given String is palindrome or not.
A Palindrome is a String which is equal to the reverse of itself, e.g., "Bob"
is a palindrome because of the reverse of "Bob" is also "Bob."
*/

public class StringPalindrome {

    public static boolean isPalindrome(String text){
        String reverse = reverse(text);
        if(text.equals(reverse)){
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
        return input.charAt(input.length()- 1)
                + reverse(input.substring(0, input.length()-1));
    }

    public static void main(String[] args) {
        String testString = "ioi";
        if(isPalindrome(testString)){
            System.out.println(testString + " is a palindrome.");
        } else {
            System.out.println(testString + " is not a palindrome.");
        }
    }

}
