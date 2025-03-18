package mymethod;

public class OverL {
	static int sum(int a,int b) {
		return a+b;
	}
	static float sum(int a,int b,float c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		int a=1,b=2;
		float c=3.5f;
		int d=sum(1,2);
		float e=sum(a,b,c);
		System.out.println(d+","+e);
		
	}

}
