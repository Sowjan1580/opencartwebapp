package myjava;
import java.util.*;
public class Operations {
	public static void main(String args[]) {
		int a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter numbers a,b:");
		a=obj.nextInt();
		b=obj.nextInt();
		c=a+b;
		System.out.println("sum="+c);
		c=a*b;
		System.out.println("multipication="+c);
		c=a-b;
		System.out.println("substraction="+c);
		c=a/b;
		System.out.println("division="+c);
		c=a%b;
		System.out.println("remainder="+c);
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a==b:"+(a==b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a>b && a<b:"+(a>b && a<b));
		System.out.println("a>b || a<b:"+(a>b || a<b));
		System.out.println("!a<b:"+!(a<b));
		System.out.println("!a>b:"+!(a>b));
	}

}
