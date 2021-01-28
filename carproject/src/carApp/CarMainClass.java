package carApp;

import cardelar.Car;

public class CarMainClass {

	public static void main(String[] args) {

		String[] bus = { "A", "B", "C", "D", "E" };
		System.out.println(bus[2]);

		int[] truck = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// System.out.println( truck[7] );

		// System.out.println(bus.length);

		System.out.println(truck.length);

		Car car1 = new Car();
		System.out.println(car1.namestar());

		String name1 = car1.carName;

		/*
		 * int distance = car1.distanceCover(); System.out.println(distance);
		 */

		// System.out.println(car1.distanceCover());

		/*
		 * System.out.println("My Car Name is " + name1 + " Car Speed is " + car1.time +
		 * " " + "Mile per hr");//calling variable
		 * System.out.println("Thus distance coverage car is " + car1.distanceCover());
		 * System.out.println("My Car color is " + car1.car_color);
		 * car1.carModel();//calling methord car1.totalTime();
		 */
		
		// aarya calling
		car1.aarya();
		
		
	}

}
