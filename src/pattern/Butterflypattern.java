package pattern;

public class Butterflypattern {
	
//	  *      *
//	  **    **
//    ***  ***
//    ********
//    ********
//    ***  ***
//    **    **
//    *      *

	public static void main(String[] args) {

			
			for (int i = 1; i <= 4; i++) 
			{
				for (int j = 1; j <=i ; j++) {
					System.out.print("*");
				}
				for (int k = 3; k >=i ; k--) {
					System.out.print(" ");
				}
				 
				for (int l = 3; l >= i; l--) {
					System.out.print(" ");
				}
				for (int m = 1; m <= i; m++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for (int i = 1; i <= 4; i++) 
			{
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = 2; j<=i ; j++) {
				System.out.print(" ");
			}
			for (int j = 2; j<=i ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
			}
	}

}
