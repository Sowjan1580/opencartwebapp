package mywhile;

public class Digits {
	    public static void main(String[] args) {
	        int number = 12345;
	        int count = 0;

	        if (number == 0) {
	            count = 1;
	        } else {
	            while (number != 0) {
	                number /= 10;
	                count++;
	            }
	        }

	        System.out.println("Number of digits: " + count);
	    }
	}


