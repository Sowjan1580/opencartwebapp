package mymethod;

public class Sum1 {
	static void sum(long n) {
		long s=0;
		while(n>0) {
			s=(s+(n%10));
			n=n/10;
		}
		System.out.println(s);
		if(s>9) {
			sum(s);
		}
		
		
	}
	public static void main(String[] args) {
		sum(66666666666L);
	}

}
