package generalprogram;

public class Prime1to100 {

	public static void main(String[] args) {

		int divide = 1;
		for (int i = 1; i <= 100; i++) {
			
			for (int j = 2; j < i; j++) {
				divide = i%j;
				System.out.println(divide);
			}
		}
	}

}
