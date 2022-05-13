package generalprogram;

public class Recursionfactorial {

	int fact = 1;
	public static void main(String[] args) {
		Recursionfactorial r = new Recursionfactorial();
		int result = r.factcalc(5);
		System.out.println(result);
		
	}
	
	int factcalc(int no){
		
		if(no>0) {
			fact= fact*no;
			factcalc(no-1);
		}
		return fact;
	}

}
