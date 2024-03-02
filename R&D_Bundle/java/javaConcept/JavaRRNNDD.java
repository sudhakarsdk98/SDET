package javaConcept;

import java.util.Iterator;

public class JavaRRNNDD {

	public static void main(String[] args) {

	// Sorting Algorithms
		int[] arr = {59,56,23,48,22};
		 
		System.out.print("Given array arr[] = ");
		for (int val : arr) {
			System.out.print(val+" ");
		}
			
		
		
		for(int i=0;i<arr.length;i++) {
			
			for (int j = i+1; j < arr.length; j++) {
			
				if (arr[i]>arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
			
		}
		System.out.print("\nBubble sorted array arr[] = ");
		for (int a : arr) {
			System.out.print(a+" ");
		}	
		
		
		
		
	}

}
