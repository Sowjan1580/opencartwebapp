package myString;

public class Newstring {
	public static void main(String[] args) {
		String s="java11.0 is a best one!";
		String al = "",num="",sp="";
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(Character.isAlphabetic(a[i])) {
				al=al+a[i];
				
			}
			else if(Character.isDigit(a[i])){
				num=num+a[i];
			}
			else if(a[i]!=' '){
				sp=sp+a[i];
			}
		}
		System.out.println("alphabets="+al+"="+al.length());
		System.out.println("num="+num+"="+num.length());
		System.out.println("sp="+sp+"="+sp.length());
	}

}
