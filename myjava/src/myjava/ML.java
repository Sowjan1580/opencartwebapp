package myjava;

class ML1 {
	void Phone() {
		System.out.println("calls");
	}

}
class ML2 extends ML1{
	void laptop() {
		System.out.println("Editing");
	}
}
class ML3 extends ML2{
	void tv() {
		System.out.println("movies");
	}
	
}
class ML4 extends ML3{
	void console(){
		System.out.println("Games");
	}
}
public class ML{ 
		public static void main(String[] args) {
			ML4 obj=new ML4();
			obj.Phone();
			obj.laptop();
			obj.tv();
			obj.console();
		
	}
}
