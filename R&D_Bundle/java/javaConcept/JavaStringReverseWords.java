package javaConcept;

public class JavaStringReverseWords {

	public static void main(String[] args) {

		// Reverse words in a String.
		String str = "Batch005 SDET Sir Shareef";
		String str1 = "";
		String[] a= str.split("\\s");
			
		System.out.println("Original String str = "+str);
		System.out.print("String str in reversed order of words str1 = ");
		for(int i =a.length-1; i>=0; i-- ) {
			
			str1 = str1 + a[i]+" ";
		}
		System.out.println(str1);
	

	// Remove spaces in a String.
	System.out.print("Approach (1) of String str1 without spaces = ");
	System.out.println(str1.replaceAll(" ", ""));
	
	// Approach 2.
	System.out.print("Approach (2) of String str1 without spaces = ");
	char[] var = str1.toCharArray();
	String str2 = "";
	
	for(int i=0;i<var.length; i++) {
		
		if (var[i] != ' ') {
			
			str2 = str2+var[i];
		}
	}
	System.out.println(str2);
	
	
	// Remove duplicates in a string
	System.out.print("String str1 without duplicate values = ");
	char[] var2 = str1.toCharArray();
	String str3 = "";
	 for (int i = 0; i < var2.length; i++) {
         // Check if the current character is not already in the result string
         if (str1.indexOf(var2[i]) == str1.lastIndexOf(var2[i])) {
             str3 = str3 + var2[i];
         }
     }

     System.out.println(str3);
	
	}
}
