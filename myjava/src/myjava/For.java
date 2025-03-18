package myjava;

public class For {
	public static void main(String[] args) {
		int n=20;
		int sum=0;
		for(int i=1;i<=n;i++) {	
				System.out.print(i);
				sum=sum+i;
				if(i<n) {
					System.out.print("+");
				}
		}
		System.out.print("="+sum);
	}

}
