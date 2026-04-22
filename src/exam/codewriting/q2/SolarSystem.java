package exam.codewriting.q2;

import java.util.LinkedList;

/*
 * We now wish to create a SolarSystem class. The beginnings of this class have been
provided to you below. Examine the instructions and complete the remaining methods.
 */

public class SolarSystem {

	// Instance variables (do not change)
	private String name ;
	private LinkedList < Planet > planets ;
	// Write the constructor for the SolarSystem class.
	// When a SolarSystem is first created, it should not contain any planets.
	public SolarSystem(name){
		this.name= name
		this.planets= LinkedList<>();
		
	}
	
	public String getName () {
		return name; 
	}
	
	public void addPlanet ( Planet p) {
		planets.add(p);
	}
	
	public int getNumberOfPlanets () {
		return planets.size();
	}
	
	/**
	* Returns the sum of the masses of all planets in the solar system
	*/
	public double getTotalMass () {
		double total= 0;
		for (Plaent p: planets){
			total += p.getMass
		}
		return total;
	}
	
	public static void main(String[] args) {
		//Write a line of code that creates an instance of the Planet class by calling the constructor. You should
		//also declare a variable to hold the newly created instance.
		//Write a line of code that creates an instance of the SolarSystem class by calling the constructor. You
		//should also declare a variable to hold the newly created instance.
		//Write a line of code that will add the Planet to the SolarSystem
		//Write a line of code that will retrieve the total mass from the SolarSystem

		SolarSystem system = new SolarSystem("Milky Way")
		Planet earth = new Planet("Earth",100);
		system.addPlanet(earth);
		double total = system.getTotalMass();
	}
}
