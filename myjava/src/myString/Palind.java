package myString;

public class Palind {
	public static void main(String[] args) {
		String s="qqqqq";
		boolean p=true;
		int j=s.length()-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(j)) {
				p=false;
				System.out.println("not");
				break;
			}
			else {
				j--;
			}
		}
		if(p==true) {
			System.out.println("yes");
		}
	}

}
