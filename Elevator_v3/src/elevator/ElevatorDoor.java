package elevator;

public class ElevatorDoor extends Door{
	
	public String opening() {
		return "Elevator Door Opened. Person gets in/out";
	}
	
	public String closing() {
		return "Elevator Door Closed";
	}
	
	public String jam() {
		return "Door Jammed";
	}
}
 