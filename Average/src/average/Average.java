package average;

import java.util.Scanner;

public class Average {
	public double average(int total) {
		int sum = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i<= total; i++){
			System.out.print("Enter the " + i + "th value : ");
			sum += sc.nextInt();
		}
		avg = (double)sum/total;
		return avg;
	}

}
