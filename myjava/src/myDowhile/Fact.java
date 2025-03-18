package myDowhile;

public class Fact {
    public static void main(String[] args) {
        int number = 5;  
        int factorial = 1;
        int temp = number;

        do {
            factorial *= temp;
            temp--;
        } while (temp > 0);

        System.out.println("Factorial of " + number + " is " + factorial);
    }

}
