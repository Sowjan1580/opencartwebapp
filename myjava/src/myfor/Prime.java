package myfor;

public class Prime {
	public static void main(String[] args) {
		int n=6,c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c=c+1;
			}
		}
		if(c==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("notprime");
		}
	}
	
	

}
