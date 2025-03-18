package myelseif;

public class Upper {
	    public static void main(String[] args) {
	        char c = 'a';
	        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	            System.out.println("Vowel");
	        } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
	            System.out.println("Consonant");
	        } else if (c >= '0' && c <= '9') {
	            System.out.println("Digit");
	        } else {
	            System.out.println("Special character");
	        }
	    }

}
