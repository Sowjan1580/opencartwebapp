package myString;

public class Len {
	public static void main(String[] args) {
		String s="ssdffsfd";
		int a=123456;
		String b=Integer.toString(a);
		System.out.println(s.length());
		for(char c:s.toCharArray()) {
			a++;
		}
		System.out.println(b);
	}

}
