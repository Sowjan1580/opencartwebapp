package mynestedif;

public class Scholar {
	    public static void main(String[] args) {
	        int score = 90;
	        int income = 40000;
	        if (score >= 85) {
	            if (income < 50000) {
	                System.out.println("Eligible for a scholarship");
	            } else {
	                System.out.println("Not eligible for a scholarship (high income)");
	            }
	        } else {
	            System.out.println("Not eligible for a scholarship (low score)");
	        }
	    }

}
