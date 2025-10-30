/*
Write a Java program to check if a given number is prime or not.
Remember, a prime number is a number which is not divisible by any other number,
e.g. 3, 5, 7, 11, 13, 17, etc. Be prepared for cross-checking till the square root of a number, etc.
*/

public class PrimeNumbers {

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        for(int number = 2; number <= 100; number++){
            if(isPrime(number)){
                System.out.println(number + " ");
            }
        }
    }
}
