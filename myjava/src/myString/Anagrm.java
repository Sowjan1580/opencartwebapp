package myString;

import java.util.Arrays;

public class Anagrm {
	public static void main(String[] args) {
		String s="qwert";
		String s1="trewqd";
		char a[]=s.toCharArray();
		char b[]=s1.toCharArray();
		boolean p=true;
		Arrays.sort(a);
		Arrays.sort(b);
		if(a.length==b.length) {
			
			
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				System.out.println("not anagram");
				p=false;
				break;
			}
		}
		}
		else {
			p=false;
			System.out.println("not anagram");
		}
		if(p==true) {
			System.out.println("yes");
		}
	}

}
