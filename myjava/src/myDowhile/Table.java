package myDowhile;

public class Table {
    public static void main(String[] args) {
        int number = 3;
        int multiplier = 1;

        do {
            System.out.println(number + "x" + multiplier + "=" + (number * multiplier));
            multiplier++;
        } while (multiplier <= 10);
    }

}
