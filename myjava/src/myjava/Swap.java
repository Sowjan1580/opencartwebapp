package myjava;

public class Swap {
	public static void main(String args[]){
		int a=2,b=3,t;
		char ch='a';
		t=a;
		a=b;
		b=t;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=10;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(--a);
		System.out.println(a--);
}

}
