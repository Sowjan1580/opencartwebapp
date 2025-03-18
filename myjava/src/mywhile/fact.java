package mywhile;

public class fact {
	public static void main(String[] args) {
		int i = 1,f=1,n=6;
        
        while (i <= n) {
            f *= i;
            i++;
        }
        
        System.out.println("Factorial: " + f);
    }
	

}
