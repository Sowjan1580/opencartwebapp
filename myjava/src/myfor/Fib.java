package myfor;

public class Fib {
	public static void main(String[] args) {
		int n=10,a=0,b=1,s=0;
		System.out.println(0);
		System.out.println(1);
		for(int i=2;i<n;i++) {	
			s=a+b;
			a=b;
			b=s;
			System.out.println(s);
		}
			
	}

}
