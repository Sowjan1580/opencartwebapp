package myjava;

public class Switch {
	public static void main(String[] args) {
		int a=12,b=6;
		int c=5;
		switch(c) {
		case(1):System.out.println(a+b);
		break;
		case(2):System.out.println(a-b);
		break;
		case(3):System.out.println(a*b);
		break;
		case(4):System.out.println(a/b);
		break;
		default:System.out.println("invalid");
		
		}
	}

}
