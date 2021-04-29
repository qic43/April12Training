package junitTests;

public class ElectricCar extends Car{
	public int NumberOfSeats;
	
	public static float ComputeEconomy(short milesDriven, short gallonsConsumed){
		return (float)milesDriven/gallonsConsumed;	
	}
	
	public static float ComputeEconomy(int kilometersDriven, int litersConsumed) {
		return (float)kilometersDriven/litersConsumed;
	}
	
	public int getSeats() {
		return NumberOfSeats;
	}
	
	public void setSeats(int seat) {
		NumberOfSeats = seat;
	}

}
