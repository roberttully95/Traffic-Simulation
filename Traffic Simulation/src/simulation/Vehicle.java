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

	// METHODS
	/**
	 * Determines how far a car will travel while it accelerates/decelerates from
	 * one speed to another.
	 * 
	 * @param u
	 *            initial velocity
	 * @param v
	 *            final velocity
	 * @return distance travelled.
	 */
	public double accelDecelDistance(double u, double v) {

		// CASE 1: CAR IS DECELERATING.
		if (v - u < 0) {
			double dist = (v * v - u * u) / 2 * deceleration;

			return dist;
		}
		// CASE 2: CAR IS ACCELERATING.
		else if (v - u > 0) {
			double dist = (v * v - u * u) / 2 * acceleration;

			return dist;
		}

		// CASE 3: CAR IS NEITHER ACCELERATING OR DECELERATING.
		else {
			return 0;
		}

	}

	/**
	 * Determines how long it takes a car to accelerate/decelerate from one speed to
	 * another.
	 * 
	 * @param u
	 * @param v
	 * @return
	 */
	public double accelDecelTime(double u, double v) {

		// CASE 1: CAR IS DECELERATING.
		if (v - u > 0) {
			double time = accelDecelDistance(u, v) / (v - u);

			return time;
		}

		// CASE 2: CAR IS ACCELERATING
		else if (v - u < 0) {
			double time = accelDecelDistance(u, v) / (u - v);

			return time;
		}

		// CASE 3: CAR IS NEITHER ACCELERATING OR DECELERATING
		else {
			return 0;
		}

	}
}
