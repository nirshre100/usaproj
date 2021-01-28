package cardelar;

public class Car {

	public String carName = "nissan ";
	public String car_color = "red";
	public int car_speed = 20; // mile per hour
	public int time = 24; // hr
	public int car_model = 2020;

	int salary; // data type variable name default value is zero

	// Car car3 = new Car();

	public String namestar() 
	{
		String firstName = "star";
		String secondName = "Khadka";

		return firstName + " " + secondName + " " + carName;

	}

	// distance = speed * time methord
	public int distanceCover() {

		return car_speed * time;
	}

	// time method
	public void totalTime() {
		System.out.println("My Car Run total mile per hour" + time);
	}

	// print car Name method
	public String carName() {
		return carName;
	}
//method car colore
	public String carColore() {
		return car_color;
	}

	public void carModel() {
		System.out.println("My car build Model is " + car_model);
	}

	public void aarya() {
		String[] bus = { "A", "B", "C", "D", "E" };
		System.out.println("Aarya calling bus is : " + bus[3]);

	}

}
