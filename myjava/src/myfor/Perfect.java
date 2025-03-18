package myfor;

public class Perfect {
	public static void main(String[] args) {
		int n=28,s=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
			s=s+i;
			}
		}	
		if(s==n) {
			System.out.println("perfect");
		}
		else {
			System.out.println("not perfect");
		}
	}

}
