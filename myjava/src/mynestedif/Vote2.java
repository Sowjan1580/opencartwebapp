package mynestedif;

public class Vote2 {
	    public static void main(String[] args) {
	        int age = 20;
	        boolean Citizen = true;
	        if (Citizen) {
	            if (age >= 18) {
	                System.out.println("Eligible to vote");
	            } else {
	                System.out.println("Not eligible to vote (under 18)");
	            }
	        } else {
	            System.out.println("Not eligible to vote (not a citizen)");
	        }
	    }

}
