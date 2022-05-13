package generalprogram;

public class Multiplicationtable {

	public static void main(String[] args) {
		int j=1;

		while(j<11) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(j+" * "+i+" = "+(j*i));
			}
			System.out.println("---------------------------------");
			j++;
		}
	}

}
