package elevator;

public class FloorDoor extends Door{
	
	public String opening() {
		return "Floor Door Opened";
	}
	
	public String closing() {
		return "Floor Door Closed";
	}
	
	public String jam() {
		return "Door Jammed";
	}
}
