package javaConcept;

public class JavaArrays {

	public static void main(String[] args) {

	/*	int[] a = { 10, 5, 2, 25, 64, 0 };

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 0; j < a.length - i - 1; j++) 

				if (a[j] > a[j + 1]) {

					int holder = a[j];

					a[j] = a[j + 1];

					a[j + 1] = holder;

				}

		}
		System.out.println("int[] a = ");
		for (int val : a) {

			System.out.print(val);

		}*/
		
		int[] a = { 10, 5, 2, 25, 64, 0 };
		for (int i = 0; i < a.length; i++) {

			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			
		}
		
		for(int arrVal : a) {
			System.out.println(arrVal);
			
		}

	}
}


