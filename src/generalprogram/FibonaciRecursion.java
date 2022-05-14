package generalprogram;

public class FibonaciRecursion {

	static int a = 0;
	static int b = 1;
	public static void main(String[] args) {

		FibonaciRecursion r = new FibonaciRecursion();
		r.fibo(10);
	}
	
	void fibo(int n) {
		
		if(n>=1) 
		{
			int c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
			fibo(n-1);
		}
	}

}
