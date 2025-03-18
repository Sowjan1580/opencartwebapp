package mywhile;

public class Palindrome {
	public static void main(String[] args) {
		int r=0,n=12211,a=n;
        
        while (n!=0) {
            int digit = n%10;
            r= r * 10 + digit;
            n/= 10;
        }
        
        if (a==r) {
            System.out.println(a + " is a palindrome.");
        } else {
            System.out.println(a + " is not a palindrome.");
        }
	}

}
