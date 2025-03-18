package myString;

public class Sum {
	public static void main(String[] args) {
		String s="1223423";
		int a=Integer.parseInt(s);
		int sum=0;
		while(a>0) {
			sum=(sum+(a%10));
			a=a/10;
		}
		System.out.println(sum);
	}

}
