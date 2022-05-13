package generalprogram;

public class Factorial {

	public static void main(String[] args) {

		//120
		int num = 10;
		int total = 1;
		for (int i = num; i >= 1; i--) {
			total = i*total;
		} 
		System.out.println(total);
	}

}
