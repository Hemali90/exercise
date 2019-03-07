package general;

public class Fibbonaci {

	/*
	 *  Fibbonacci series:
	 *  1 1 2 3 5 8 13 .....
	 *  
	 *  fib(0) -> 0
	 *  fib(1) -> 1
	 *  fib(2) -> 1
	 *  -
	 *  -
	 *  
	 */
	
	/**
	 * Recursive approach
	 * 
	 * Very inefficient: because 
	 * 				 f(4)
	 * 				/     \
	 * 			f(3)        f(2)
	 * 			/  \		 /  \
	 * 		 f(2) f(1) 	  f(1)  f(0)
	 * 
	 * which is O(2^n) complexity
	 */
	
	public int fibRecursive(int n){
		if(n == 0 || n == 1){
			return n;
		} else 
		
		return fibRecursive(n-1) + fibRecursive(n-2);	
	}
	
	/**
	 * complexity O(n)
	 * @param n
	 */
	public void fib(int n){
		if(n==0 || n==1){
			return n;
		}
		int a = 0;
		int b = 1;
		int c;
		for(int i=2;i<= n ; i++){
			c = a + b;
			a = b;
			b = c;
		}
		
		return c;
	}
}
