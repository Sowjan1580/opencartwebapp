package myString;

public class RevS {
	public static void main(String[] args) {
		String s="java is a pgm";
		String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
