
public class Fibonacci {
	
	public static int fibo(int fib) {
		
		if(fib ==1 || fib ==2) {
			return 1;
		}
		int fibo1 = 1;
		int fibo2 = 1;
		int fibonacci = 1;
		for(int i = 3; i<=fib; i++){
			
			fibonacci = fibo1+fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
			
		}
		return fibonacci;
	}

	public static void main(String[] args) {
		
		int fib = fibo(13);
		System.out.println(fib);
		

	}

}
