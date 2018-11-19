package armstrong;

class ArmstrongNumbers{
	int digits;
	int singledigit;
	int result;
	
	void Armstrong(int OriginalNumber){
		int num = OriginalNumber;
		while (num != 0){
			num/=10;
			digits++;
		}
		num = OriginalNumber;
		while (num != 0){
			singledigit = num %10;
			int temp = digits;
			int multiply = 1;
			while (temp !=0){
				multiply *= singledigit;
				temp--;
			}
			result += multiply;
			num /= 10;
		}
		if (result == OriginalNumber){
			System.out.println(OriginalNumber+" is Armstrong number");
		}else{
			System.out.println(OriginalNumber+" is not Armstrong number");
		}
	}


}
