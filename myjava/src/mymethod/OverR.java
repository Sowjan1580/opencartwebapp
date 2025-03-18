package mymethod;

class Hello {
	public void Hi() {
		System.out.println("Hi");
	}

}
class OverR extends Hello{
	public void Hi() {
		System.out.println("Hello");}
		public static void main(String[] args) {
				Hello a=new Hello();
				OverR b=new OverR();
				a.Hi();
				b.Hi();
				
		
	}
}

