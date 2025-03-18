package myString;

import java.util.Arrays;

public class HighR {
	public static void main(String[] args) {
		String s="cfsdfssfs";
		char a[]=s.toCharArray();
		int maxc=1,i,j;
		char b=' ';
		Arrays.sort(a);
		for(i=0;i<a.length;i++) {
			int c=1;
			for(j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
				}
				else {
					break;
				}
			}
			if(c>maxc) {
				maxc=c;
				b=a[i];
				i=j-1;
			}
		}
		System.out.println(b+"="+maxc);
	}

}
