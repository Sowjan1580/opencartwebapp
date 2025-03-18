package myarray;

public class Matmul {
	public static void main(String[] args) {
		int a[][] = { { 2, 4 }, { 6, 8 } };
		int b[][] = { { 3, 5 }, { 7, 9 } };
		int c[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 2; k++) {
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
