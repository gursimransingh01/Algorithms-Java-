package Sorting;

public class Selection {
	
	public static void selectionSort(int[] A){
		int min=0;
		for(int i=0; i<A.length; i++){
				min = i;
			for(int j=i+1; j<A.length; j++){
				if(A[j]<A[min]){
					min = j;
				}
			}
				//Swapping elements
				int temp = A[min];
				A[min] = A[i];
				A[i] = temp;
			
		}
		System.out.print("Sorted array is:");
		for(int k=0; k<A.length; k++){
			System.out.print(" " + A[k]);
		}
	}

	public static void main(String[] args) {
		int[] A = {3, 9, 5, 7};
		selectionSort(A);
		
	}

}
