package myjava;

public class Hill {
	public static void main(String[] args) {
		int n=6;
		for(int i=n;i>=1;i--) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int m=1;m<=i;m++) {
			System.out.print("* ");
			}
			
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
