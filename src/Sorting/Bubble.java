package Sorting;

public class Bubble {

	public static void bubbleSort(int[] A){
		for(int pass=A.length-1; pass>=0; pass--){
			for(int i=0; i<A.length-1; i++){
				if(A[i]>A[i+1]){
					int temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted array is: ");
		for(int j=0; j<A.length; j++){
			System.out.print(" " + A[j]);
			
		}
		}
	
	public static void main(String[] args) {
		int[] A = {9};
		bubbleSort(A);
		
	}

}
