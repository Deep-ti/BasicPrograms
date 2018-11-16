package harmonics;

public class HarmonicNumber {
	public double harmonicNumbers(int num) {
		
		double harmonic =0.0;
		for (int i = 1; i<= num; i++) {
			harmonic = harmonic + (1.0/i);
		}
		
		return harmonic;
	}

}
