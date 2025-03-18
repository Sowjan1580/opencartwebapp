package myString;

public class Words {
	public static void main(String[] args) {
		String s="java  is a difficult programming language";
		String a[]=s.split("\\s+");
		System.out.println("words="+a.length);
	}

}
