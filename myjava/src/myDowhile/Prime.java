package myDowhile;

public class Prime {
	public static void main(String[] args) {
		int n=10,c=0,i=1;
		do {
			if(n%i==0) {
			c++;
			}	
			i++;
		}
		while(i<=n);
		if(c==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
