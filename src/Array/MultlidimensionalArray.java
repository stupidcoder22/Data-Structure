package Array;

public class MultlidimensionalArray {

	public static void main(String[] args) {

		int a[][]= {{23,43,21},{2,4,3},{8,88,67}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
