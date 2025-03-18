package myjava;

public class Butterfly {
	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int m=1;m<=i;m++) {
			System.out.print("*");
			}
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int m=1;m<=i;m++) {
			System.out.print("*");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
