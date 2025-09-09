public class StringConversion {
    public static void main(String[] args) {
        // Input string
        String str = "thisisastringconversionchallenge!";

        StringBuilder strBldr = new StringBuilder();

        int len = str.length();

        // Loop through each character in the input string
        for (int i = 0; i < len; i++) {
            // Check if the current character is in the first half of the string
            if (i <= len / 2) {
                // Convert the character to uppercase and append it to the result
                char a = Character.toUpperCase(str.charAt(i));
                strBldr.append(a);
            } else {
                // if the character is in the second half, just append it as is
                strBldr.append(str.charAt(i));
            }
        }

        // Print the final result
        System.out.println(strBldr);
    }
}