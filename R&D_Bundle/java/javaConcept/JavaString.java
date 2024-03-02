package javaConcept;

public class JavaString {

	public static void main(String[] args) {
		
		String str1 = "sdet";
		String str2 = "SDET";
		String str3 = "sdet";
		String str4 = new String("SDET");
		
		System.out.println(str1==str2); // O/p: false; (in-terms of ASCII values), individual objects are created 
		System.out.println(str1==str3); // O/p: true; (in-terms of ASCII values), constant pool object is created.
		System.out.println(str4==str2); // O/p: false; as the new keyword is used to create separate object.
		
		
		System.out.println("\nstr1.equals(str2) : "+str1.equals(str2)); // O/p: false; (in-terms of ASCII values), contents are not equal. 
		System.out.println("str1.equals(str3) : "+str1.equals(str3)); // O/p: true; (in-terms of ASCII values), contents are equal.
		System.out.println("str4.equals(str1) : "+str4.equals(str2)); // O/p: true; as the contents are equal though objects are different.
		
		
		// In StringBuffer, we cannot assign values directly (as it'll be String literal)
		StringBuffer sb1 = new StringBuffer("sdet"); 
		StringBuffer sb3 = new StringBuffer("sdet");
		
		System.out.println("\nsb1.equals(sb3) : "+sb1.equals(sb3)); // O/p: false; as StringBuffer class .equals() compares references unlike in String class.
		
				
	}

}
