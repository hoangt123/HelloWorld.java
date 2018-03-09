public class LeapYear {
	public static void LeapYear(int year) {
		if (year % 100 == 0 || year % 4 == 0 || year % 400 == 0) {
		System.out.println (year + " is a leap year.");
		}
		else {
		System.out.println (year + " is not a leap year.");
		}
	}

    public static void main(String[] args) {
        LeapYear(3000);
	LeapYear(5000);
        
    }
}
