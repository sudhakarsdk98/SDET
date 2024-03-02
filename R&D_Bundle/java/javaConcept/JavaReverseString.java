package javaConcept;

public class JavaReverseString {

	public static void main(String[] args) {

		// to print a string in reverse order.
		
		String str1 = "SDET";
		
		char[] var1 = str1.toCharArray();
		
		
		for(int i=var1.length-1; i>=0; i--) {
			
			System.out.print(var1[i]);
		}
		
		System.out.println("\n");
		
		// Approach 2.
		
		StringBuffer sb = new StringBuffer(str1);
		
		System.out.print(sb.reverse());
		
	}

}
