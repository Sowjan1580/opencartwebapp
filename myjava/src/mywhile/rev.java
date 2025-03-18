package mywhile;

public class rev {
	public static void main(String[] args) {
        int r= 0,n=1123456;
        
        while (n != 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            n/= 10;
        }
        
        System.out.println("Reversed Number: " + r);
	}

}
