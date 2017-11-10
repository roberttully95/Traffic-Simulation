package simulation;
/*NOTES
 * 1. 	We use a constructor to set variable values rather than setters 
 * 		because the creation time and max speed are defined upon the 
 * 		object's creation and cannot be changed.
 */

public class Highway {

	private int length;
	private int numberOfLanes;
	private final double speedLimit = 33.528;

	public Highway(int length, int numberOfLanes, int speedLimit) {

		this.length = length;
		this.numberOfLanes = numberOfLanes;

	}

	// GETTERS
	public int getLength() {
		return length;
	}

	public int getNumberOfLanes() {
		return numberOfLanes;
	}

	public double getSpeedLimit() {
		return speedLimit;
	}
}
