package generalprogram;

public class Swapnumber {

	public static void main(String[] args) {
		
		int a = 23;
		int b = 43;
		int temp;
		//with the help of third variable
		temp = b;
		b = a;
		a = temp;
		System.out.println(a+" "+b);
		
		//without the help of third variable
		int m = 10;
		int n = 20;
		m = m+n;
		n = m - n;
		m = m - n;
		System.out.println(m+" "+n);
	}

}
