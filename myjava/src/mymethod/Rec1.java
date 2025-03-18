package mymethod;

public class Rec1 {
	static int sum=0;
	static int a=0;
	static int b=1;
		static int Fib(int n) {
			if(n<1) {
				return sum;	
			}
			else {
				sum=a+b;
				a=b;
				b=sum;
				System.out.println(sum);
				return(Fib(n-1));
			}
		}
		public static void main(String[] args) {
			System.out.println(0+" "+1);
			int c=10;
			Fib(c-2);
		}

}
