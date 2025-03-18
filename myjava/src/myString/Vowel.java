package myString;

public class Vowel {
	public static void main(String[] args) {
		String s="qwertyuiopasdfghjk";
		char a[]=s.toCharArray();
		String v="",c="";
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(a[i])) {
				if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u') {
					v=v+a[i];
				}
				else {
					c=c+a[i];
				}
			}
				
		}
		System.out.println(v);
		System.out.println(c);
	}

}
