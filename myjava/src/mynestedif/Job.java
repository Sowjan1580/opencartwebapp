package mynestedif;

public class Job {
	    public static void main(String[] args) {
	        int age = 30;
	        int experience = 5;
	        if (age >= 25) {
	            if (experience >= 3) {
	                System.out.println("Eligible for the job");
	            } else {
	                System.out.println("Not eligible for the job (less experience)");
	            }
	        } else {
	            System.out.println("Not eligible for the job (young age)");
	        }
	    }

}
