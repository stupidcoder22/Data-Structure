package pattern;

public class Panlindromicpattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			for (int j = 2; j <=i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}
