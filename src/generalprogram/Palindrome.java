package generalprogram;

public class Palindrome {

	public static void main(String[] args) {
			int temp = 343;
			int num = temp;
			int rev = 0;
			int rem = 0;
			
			while(num!=0) {
				rem = num%10;
				rev = rev*10 + rem;
				num = num/10;
			}
			
			if(rev == temp) {
				System.out.println("it is palindrome");
			}else {
				System.out.println("it is not palindrome");
			}
		}

	}

