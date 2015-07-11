package elevator;

public class Facade {
	
	public int services(Building blg,Floor src,Floor dest){
		
		int dst=dest.getFlrNo();
    	if(dest.getFlrNo() > src.getFlrNo())
    		blg.floors.get(src.getFlrNo()).up.press();
    	else if(src.getFlrNo() > dest.getFlrNo())
    		blg.floors.get(src.getFlrNo()).down.press();
    	  
    	
        int currentLiftFloor=blg.elev.Elevatorservices(src);   // move the elevator
         // System.out.println("---------------------"+dest.getFlrNo());
        System.out.println(blg.floors.get(currentLiftFloor).fDoor.opening());    // at source
        System.out.println(blg.elev.elvDor.opening());
    	
        System.out.println(blg.elev.elvDor.closing());
        System.out.println(blg.floors.get(currentLiftFloor).fDoor.closing());
        
        
        dest.setFlrNo(dst);
        currentLiftFloor=blg.elev.Elevatorservices(dest);    // move the elevator
    	
        System.out.println(blg.floors.get(currentLiftFloor).fDoor.opening());    // at dest
        System.out.println(blg.elev.elvDor.opening());
    	
        System.out.println(blg.elev.elvDor.closing());
        System.out.println(blg.floors.get(currentLiftFloor).fDoor.closing());
    	
    	
    	return currentLiftFloor;
    	
    }
}
