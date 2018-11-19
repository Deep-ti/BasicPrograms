package rangefilter;

import java.util.Scanner;

public class RangeFilter {
	
	public boolean rangeFilter(int lo , int hi) {
		boolean isRange = false;
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter the value: ");
		int value = sc.nextInt();
		if(value>=lo && value <=hi) {
			isRange = true;
		}
		return isRange;
	}
	
}
