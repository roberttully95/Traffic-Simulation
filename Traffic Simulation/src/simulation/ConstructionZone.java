package simulation;
/*NOTES
 * 1. 	We use a constructor to set variable values rather than setters 
 * 		because the creation time and max speed are defined upon the 
 * 		object's creation and cannot be changed.
 */

public class ConstructionZone {

	private int length;
	private int numberOfLanes;
	private int speedLimit;

	public ConstructionZone(int length, int numberOfLanes, int speedLimit) {

		System.out.println("New construction zone has been created.");
		this.length = length;
		this.numberOfLanes = numberOfLanes;
		this.speedLimit = speedLimit;

	}

	// GETTERS
	public int getLength() {
		return length;
	}

	public int getNumberOfLanes() {
		return numberOfLanes;
	}

	public int getSpeedLimit() {
		return speedLimit;
	}

}
