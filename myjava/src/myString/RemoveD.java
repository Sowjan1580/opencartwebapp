package myString;

public class RemoveD {
	public static void main(String[] args) {
		String s="ibiisbhsi";
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=0;j<=i;j++) {
				if(a[i]==a[j]) {
					c++;
				}
			}
			if(c==1) {
				System.out.println(a[i]);
			}
		}
	}

}
