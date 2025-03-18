package myswitch;

public class Color {
	    public static void main(String[] args) {
	        char color = 'R';
	        switch (color) {
	            case 'R':
	                System.out.println("Red");
	                break;
	            case 'G':
	                System.out.println("Green");
	                break;
	            case 'B':
	                System.out.println("Blue");
	                break;
	            default:
	                System.out.println("Invalid color code");
	        }
	    }

}
