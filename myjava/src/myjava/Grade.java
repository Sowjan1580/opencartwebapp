package myjava;

public class Grade {
	public static void main(String[] args) {
		int telugu=50,hindi=50,english=30,maths=50,science=50;
		float average=(telugu+hindi+english+maths+science)/5;
		System.out.println((telugu<35 || hindi<35 || english<35 || maths<35 || science<35)?"Fail":(average>=90)?"A":(average>=80)?"B":(average>=70)?"C":(average>=60)?"D":(average>=50)?"E":"P");
		
	}

}
