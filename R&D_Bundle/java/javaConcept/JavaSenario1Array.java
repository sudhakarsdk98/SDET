package javaConcept;

public class JavaSenario1Array {

	public static void main(String[] args) {

		int[] ar = {43,6,46,34,233,13,53,4};
		
		int max = ar[0]; // initialized the value 
		int min = ar[0];
		System.out.println(ar.length);
		for(int i=0; i<ar.length;i++) { // increment starts from index - 0 
			
			if(ar[i]>max) { // in every increment, if num is greater than max then it is the max value. 
				max = ar[i]; 
			}
			
			if(ar[i]<min) { // in every increment, if num is less than min then it is the max value.
				min = ar[i];
			}
			
		}


		System.out.println("max is "+max+" min is "+min);
		
	}

}
