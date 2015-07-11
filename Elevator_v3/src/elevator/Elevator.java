package elevator;

import java.util.ArrayList;

public class Elevator {
	
	
	public Floor currentFloor;
	ElevatorDoor elvDor = new ElevatorDoor();
	FloorPanel fp;
	
	public Elevator(ArrayList<Floor> floors){                // constructor
		fp = new FloorPanel(floors.size());
	}
	
	public void setCurrentFloor(Floor f){                   // set floor
		currentFloor = f;
	}
		
	
	public int Elevatorservices(Floor desti){              // floor of destination needed
		
		int destFloor=fp.Buttons.get(desti.getFlrNo()).getNumber();
		
		if(currentFloor.getFlrNo() < desti.getFlrNo())
			this.Moveup(desti);
		else if(currentFloor.getFlrNo() > desti.getFlrNo())
			this.MoveDown(desti);
		
		return destFloor;
	}
	
	
	public void Moveup(Floor dest){                          //  move up the lift
		this.fp.Buttons.get(dest.getFlrNo()).press();
		System.out.println("Moving UP");
		currentFloor.setFlrNo(dest.getFlrNo());
		
	}
	
	public void MoveDown(Floor dest){                       //  move down lift
		this.fp.Buttons.get(dest.getFlrNo()).press();
		System.out.println("Moving Down");
		currentFloor.setFlrNo(dest.getFlrNo());
	}
	
}
