package elevator;

public class Floor {
	
	
	 private Integer flrNo;
     
	 UpButton up;
     DownButton down;
     FloorDoor fDoor;
         
 	Floor(Integer flrNo) {
 		this.flrNo = flrNo;
 		up=new UpButton();
 		down=new DownButton();
 		fDoor=new FloorDoor();
 	}
 	
	public Integer getFlrNo() {
		return flrNo;
	}

	public void setFlrNo(Integer flrNo) {
		this.flrNo = flrNo;
	}
	
 	
}
