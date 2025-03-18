package myString;

public class Rev1 {
	public static void main(String[] args) {
		String s="my name is sowjan";
		char a[]=s.toCharArray();
		int j=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=' ') {
				if(a[j]!=' ') {
					System.out.print(a[j]);
					j=j-1;
				}
				else {
					System.out.print(a[j-1]);
					j=j-2;
				}
			}
			else {
				System.out.print(" ");
			}
			
		}
			
	}
}


