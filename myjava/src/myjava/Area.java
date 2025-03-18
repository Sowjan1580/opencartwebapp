package myjava;
import java.util.*;
public class Area {
	public static void main(String args[]) {
		int a,b;
		float c;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter length,breadth");
		a=obj.nextInt();
		b=obj.nextInt();
		c=0.5f*(a*b);
		System.out.println("Area of rectangle="+a*b+"m2");
		System.out.println("Area of square="+a*a+"m2");
		System.out.println("Area of triangle="+c+"m2");
	}

}
