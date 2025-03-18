package mynestedif;

public class Discount {
	    public static void main(String[] args) {
	        int age = 25;
	        boolean Student = true;
	        if (Student) {
	            if (age < 30) {
	                System.out.println("Eligible for a discount");
	            } 
	            else {
	                System.out.println("Not eligible for a discount (old age)");
	            }
	        }
	        else {
	            System.out.println("Not eligible for a discount (not a student)");
	        }
	    }

}
