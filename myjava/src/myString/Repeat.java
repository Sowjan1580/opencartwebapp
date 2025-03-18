package myString;

import java.util.Arrays;

public class Repeat {
	public static void main(String[] args) {
		String s="effsf  fsfsdfs sfsdfsdf";
		char a[]=s.toCharArray();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			if(Character.isLetter(a[i])) {
				int c=0;
				for(int j=0;j<a.length;j++) {
					if(i<a.length-1) {
						if(a[i]!=a[i+1]) {
							if(a[i]==s.charAt(j)) {
							c=c+1;
						}	
					}
					}
					else if(a[i]==s.charAt(j) && i==a.length-1) {
						c=c+1;
					}
				}
				if(c>1) {
					System.out.println(a[i]+"="+c);
				}
				
				
			}
		}
	}

}
