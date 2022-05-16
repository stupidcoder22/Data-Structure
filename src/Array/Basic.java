package Array;

public class Basic {

	public static void main(String[] args) {

		int[] a = new int[4];
				a[0]=13;
				a[1]=54;
				a[2]=52;
				a[3]=22;
				
//				or
				
		int[] b = {32,2,3,53,233,645};
		
		
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("----------------------------------------");
		for (int i : b) {
			System.out.println(i);
		}
	}

}
