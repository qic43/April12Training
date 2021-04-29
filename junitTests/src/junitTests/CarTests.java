package junitTests;

public class CarTests {
	public static void CanComputeEconomyImperial() {
		short a = 312;
		short b = 10;
		float result = Car.ComputeEconomy(a,b);
		System.out.println("The efficency is "+result);
	}
	
	public static void CanComputeEconomyMetric() {
		int a = 502;
		int b = 38;
		float result = Car.ComputeEconomy(a,b);
		System.out.println("The efficency is "+result);
	}
	
	public static void main(String[] args) {
		CanComputeEconomyImperial();
		CanComputeEconomyMetric();
		Car c = new Car();
		c.setSeats(4);
		System.out.println("The Seat of Car c is " + c.getSeats());
		Car e = new ElectricCar();
		e.setSeats(4);
		System.out.println("The Seat of Car e is " + e.getSeats());
	}
}
