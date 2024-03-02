package javaConcept;

public class JavaStringConstantPool {

	public static void main(String[] args) {
		

		String str1 = "abc";
		String str2 = str1.concat("");
		String str3 = new String("abc");
		String str4 = str3.concat("");
		String str5 = str3.concat(" ");
		String str6 = new String("abc");
		String str7 = "abc"+"";
		
		System.out.println(str1==str2); // true
		System.out.println(str1==str3); // false
		System.out.println(str3==str4); // true
		System.out.println(str4==str5); // false
		System.out.println(str3==str6); // false
		System.out.println(str1==str7); // true
		System.out.println(str2==str7); // true
		System.out.println(str4==str7); // false
	
	}

}
