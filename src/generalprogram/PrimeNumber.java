package generalprogram;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 9;
		int divide = 1;
		for (int i = 2; i < num; i++) {
			divide = num%i;
			if(divide==0) {
				break;
			}
		}
			
			if(divide == 0)
			{
			System.out.println("it is not prime number");
			}
			
			if(divide!=0)
			{
				System.out.println("It is prime number");
			}
	}
		
		
	}

