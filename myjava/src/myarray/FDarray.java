package myarray;

public class FDarray {
	public static void main(String[] args) {
		int a[][][][]= {{{{1,2,3},{2,3,4}},{{1,2,3},{3,4,5}}},{{{1,2,3},{2,3,4}},{{1,2,3},{3,4,5}}}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					for(int l=0;l<3;l++) {
						System.out.print(a[i][j][k][l]+" ");
					}
					System.out.println();
				}
			}
		}
	}

}
