package mynestedif;

public class Loan {
	    public static void main(String[] args) {
	        int income = 60000;
	        int creditScore = 650;

	        if (income > 50000) {
	            if (creditScore > 600) {
	                System.out.println("Eligible for a loan");
	            } else {
	                System.out.println("Not eligible for a loan (low credit score)");
	            }
	        } else {
	            System.out.println("Not eligible for a loan (low income)");
	        }
	    }
	}