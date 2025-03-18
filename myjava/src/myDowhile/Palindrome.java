package myDowhile;

public class Palindrome {
    public static void main(String[] args) {
        int number = 12321;  // Example number
        int originalNumber = number;
        int reversedNumber = 0;

        do {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        } while (number > 0);

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }

}
