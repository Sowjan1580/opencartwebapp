package myjava;
import java.util.*;
public class marks{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		if (a>90){
			System.out.println("EX Grade");
		}
		else if(a>80 && a<91) {
			System.out.println("A Grade");
		}
		else if(a>70 && a<81) {
			System.out.println("B Grade");
		}
		else if(a>60 && a<71) {
			System.out.println("C Grade");
		}
		else if(a>50 && a<61) {
			System.out.println("D Grade");
		}
		else if(a>=40 && a<51) {
			System.out.println("P Grade");
		}
		else{
			System.out.println("F Grade");
		}
			
	}

}
