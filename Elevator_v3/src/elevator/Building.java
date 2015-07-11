package elevator;

import java.util.ArrayList;

public class Building {
    Elevator elev;
    
    ArrayList<Floor> floors=new ArrayList<Floor>();
    
    public Building(Integer numFloors){
    	for(int i=0;i<=numFloors;i++){
    		floors.add(new Floor(i));
    	}
    	elev=new Elevator(floors);
    }
    
    public int services(Floor src,Floor dest){
    	
    	Proxy proxy=new Proxy();
    	return proxy.services(this, src, dest);
    	
    }
}
