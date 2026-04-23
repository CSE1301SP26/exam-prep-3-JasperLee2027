package exam.codewriting.q4;

/*
 * We wish to create a Car class. A Car has-a(n):
 * 
 * Odometer, which tracks how many miles the car has been driven.
 * Fuel efficiency, typically given as miles-per-gallon.
 * Fuel tank, which can hold some amount of fuel, in gallons.
 * Current amount of fuel.
 */

public class Car {

	// Declare your instance variables here:
	private double odometer;
	private double fuelEfficiency;
	private double totalFuel;
	private double currentFuel;
	// Write the constructor for the Car class:
	// (For full credit the constructor should use only two parameters)
	public Car (double fuelEfficiency, double totalFuel ) {
		this.fuelEfficiency= fuelEfficiency;
		this.totalFuel= totalFuel;
		this.odometer= 0;
		this.currentFuel= 0;
	}
	
	/**
	* Drives the car at the given speed for the given amount of time or until out of fuel.
	* (Hint: Carefully consider the impact of driving to all instance variables).
	*/
	public void drive ( double milesPerHour , double hours ) {
		double requestedMiles= milesPerhour * hours;
		double maxMiles= this.currentFuel * fuelEfficiency;
		double actualMiles;
		if (requestedMiles < maxMiles) {
			actualMiles = requestedMiles;
		}
		else {
			actualMiles=maxMiles;
		}
		this.odometer += actualMiles;
		this.currentFuel -= actualMiles/this.fuelEfficiency;
	}
	
	public double getMilesDriven () {
		return this.odometer; 
	}
	
	/**
	* Adds fuel to the tank as long as it does not exceed the tank’s capacity.
	* @return portion of fuel that couldn’t be added
	*/
	public double addFuel ( double gallons ) {
		this.currentFuel += gallons;
		if (this.currentFuel>this.totalFuel) {
			double overflow= this.currentFuel-this.totalFuel;
			this.currentFuel= this.totalFuel;
			return overflow;
		}
		else {
			return 0;
		}
	}
	
	
}
