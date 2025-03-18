package myDowhile;

public class Fib {
    public static void main(String[] args) {
        int n = 10;  
        int a = 0;
        int b = 1;
        int count = 0;

        do {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
            count++;
        } while (count < n);
    }

}
