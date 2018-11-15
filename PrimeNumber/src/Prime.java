
public class Prime {
	
	public static boolean isPrime(int num) {
		boolean flag = true;
		if(num == 1) {
			flag = false;
			return flag;
		}
		for(int i = 2; i< num/2; i++) {
			if (num % i ==0) {
				flag = false;
				break;
			}
		}
		return flag;
		
	}

	public static void main(String[] args) {
		boolean isPrime = isPrime(6);
		System.out.print("6 is Prime Number " +isPrime);

	}

}
