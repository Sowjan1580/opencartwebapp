package mymethod;

public class Sum {
	static int Sum1(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n=5;
		int b=Sum1(n);
		System.out.println(b);
	}

}
