package generalprogram;

public class FibonaciSeries {

	public static void main(String[] args) {

		//0 1 1 2 3 5 8 13
		
		int m = 0;
		int n = 1;
		int num = 8;
		int sum;
		
		for (int i = 1; i < num ; i++) {
			sum = m + n;
			System.out.print(sum +" ");
			m = n;
			n = sum;
			
		}
		
		
	}

}
