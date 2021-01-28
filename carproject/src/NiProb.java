
public class NiProb {

	public static void main(String[] args) {

		String firstName = "chan";
		String lastName = "smith";
		int Age = 50;
		char Gender = 'M';
		boolean fullTime = true;

		System.out.println(PayCheck()); // calling the PayCheck Method

		float a = PayCheck();

	}

	// Creating Method for Pay Check
	public static float PayCheck() {
		float payRate = 20.75f;
		int hoursWorked = 30;
		return payRate * hoursWorked;
	}

}
