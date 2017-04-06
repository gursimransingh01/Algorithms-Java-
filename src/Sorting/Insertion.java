package Sorting;

public class Insertion {
	
	public static void insertionSort(int[] A){
		int v, j;
		for(int i=1; i<=A.length-1; i++){
			for(j=i; j>0; j--){
				if(A[j-1]>A[j]){
					v = A[j];
					A[j] = A[j-1];
					A[j-1] = v;
				}
			}
		}
		
		for(int p=0; p<A.length; p++){
			System.out.println(A[p]);
		}
	}

	public static void main(String[] args) {
		int[] A = {5,1,8,14};
		insertionSort(A);
	}

}
