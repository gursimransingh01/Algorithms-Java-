package Recursion;

public class factorial {
	
	public static long fact(int n){
		if(n<=1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		int a = 4;
		System.out.println("Factorial is: "+fact(a));
	}

}
