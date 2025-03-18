package myjava;

public class Array {
	public static void main(String[] args) {
		int a[]=new int[3];
		for(int i=0;i<a.length;i++) {
			a[i]=10*(i+1);
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
