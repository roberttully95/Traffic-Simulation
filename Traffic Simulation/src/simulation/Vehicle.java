package simulation;
/*NOTES
 * 1. 	We use a constructor to set variable values rather than setters 
 * 		because the creation time and max speed are defined upon the 
 * 		object's creation and cannot be changed.
 */

public class Vehicle {

	private int creationTime;
	private double maxSpeed;
	private final double carLength = 4.5;
	private final double acceleration = 3.5;
	private final double deceleration = -5.0;

	// CONSTRUCTOR
	public Vehicle(int creationTime, double maxSpeed) {

		this.creationTime = creationTime;
		this.maxSpeed = maxSpeed;

	}

	// GETTERS
	public double getCarLength() {
		return carLength;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public int getCreationTime() {
		return creationTime;
	}

	public double getDeceleration() {
		return deceleration;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}
}
