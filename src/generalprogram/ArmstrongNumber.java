package generalprogram;


public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 372;
		int data = num;
		int count = 0;
		int result = 0;
		
		
		
		while(data!=0) {
			data = data/10;
			count++;
		}
		
		String temp = Integer.toString(num);
		int numarray[]= new int[temp.length()];
		
		for (int i = 0; i < temp.length(); i++){
		    numarray[i] = temp.charAt(i) - '0';
		}
		
		for (int i = 0; i < numarray.length; i++) {
			result = (int) (result + Math.pow(numarray[i], count));
		}
		
		if(result == num) {
			System.out.println("It is a armstrong number");
		}else {
			System.out.println("It is not a armstrong number");
		}
	}

}
