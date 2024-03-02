package javaConcept;

public class JavaProgramsPalindrome {

	public static void main(String[] args) {
		String str1 = "panda";
		String str2 = "madam";
		int num1 = 102012;
		int num2 = 12121;
		String str;
		int num;
		// Check Palindrome : String and Number
		// Palindrome String approach 1.
		str = str1;
		StringBuffer sb = new StringBuffer(str);
		if (str.contentEquals(sb.reverse())) {
			System.out.println(str+" is a Palindrome");
		}else {
			System.out.println(str+" is not a Palindrome");
		}
		
		// Palindrome String approach 2
		str = "";
		for(int i=str2.length()-1; i>=0; i--) {
			
			str = str+str2.charAt(i);
		}
		if (str.equals(str2)) {
			System.out.println(str2+" is a Palindrome");
		} else {
			System.out.println(str2+" is not a Palindrome");
		}
		
		// Palindrome Number approach 1.
		num = num1;
		str = ""+num;
		int i=0, j=str.length()-1;
		boolean flag = false;
		while (i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				flag = true;
			}
			i++;
			j--;
		}
//		if(flag) {
//			System.out.println(num+" is a Palindrome number");
//		}else {
//			System.out.println(num+" is not a Palindrome number");
//		}
		
		// Using Ternary operator to print the result.
		System.out.println((flag)?num+" is a Palindrome number":num+" is not a Palindrome number");
		
		// Palindrome Number approach 2.
		num = num2;
		
		int revNum=0;
		while (num!=0) {
			revNum = revNum*10+num%10;
			num = num/10;
		}
		System.out.println((num2==revNum)?num2+" is a Palindrome number":num2+" is not a Palindrome number");
		

	}

}
