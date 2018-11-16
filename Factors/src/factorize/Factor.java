package factorize;

public class Factor {
	public void factor(int num) {
		int fact;
		for(fact = 2; fact*fact <= num/2; fact++) {
			
			while(num % fact == 0) {
				
				System.out.print(fact + " ");
				num = num /fact;
				if (num > 1) System.out.println(num);
		        else       System.out.println();
			}
		}
		
	}

}
