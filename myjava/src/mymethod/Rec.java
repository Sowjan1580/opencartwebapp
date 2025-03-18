package mymethod;

public class Rec {
	 static int Rec1(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*Rec1(n-1);
		}
		
	}
	public static void main(String[] args) {
		int n=5;
		int a=Rec1(n);
		System.out.println(a);
	}

}
