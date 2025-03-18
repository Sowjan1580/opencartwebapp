package myifelse;

public class Char {
    public static void main(String[] args) {
        char ch = 'A';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not an alphabet");
        }
    }


}
