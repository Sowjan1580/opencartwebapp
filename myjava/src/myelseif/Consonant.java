package myelseif;

public class Consonant {
	    public static void main(String[] args) {
	        char ch = 'b';
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            System.out.println("Vowel");
	        } else if (ch >= 'a' && ch <= 'z') {
	            System.out.println("Consonant");
	        } else {
	            System.out.println("Not a letter");
	        }
	    }

}
