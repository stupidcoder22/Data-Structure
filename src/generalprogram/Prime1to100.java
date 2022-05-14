package generalprogram;

public class Prime1to100 {

	public static void main(String[] args) {

		int divide = 1;
		for (int i = 2; i <= 100; i++) {
			
			for (int j = 2; j < i; j++) {
				divide = i%j;
				
				if(divide==0) {
					break;
				}
			}
			
			if(divide!=0) {
				System.out.println(i+" ");
			}
		}
	}

}
