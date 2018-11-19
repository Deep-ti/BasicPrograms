package leapyear;

public class LeapYear {
	
	public boolean isLeapYear(int year) {
		boolean isLeapYear = false;
		if(year % 100  ==  0 && year  % 400  == 0){
			isLeapYear = true;
		}
		else if(year % 100 !=0 && year % 4 == 0) {
			isLeapYear = true;
		}
		return isLeapYear;
	}

}
