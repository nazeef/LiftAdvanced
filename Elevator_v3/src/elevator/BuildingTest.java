package elevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuildingTest {

	Building bldg=new Building(5);
	
	@Test
	public void testServices() {
		
		bldg.elev.setCurrentFloor(bldg.floors.get(0));          // case 1
		assertEquals(0,bldg.services(bldg.floors.get(3),bldg.floors.get(0)));
		
		System.out.println("---------------------------------------------");
		
		bldg.elev.setCurrentFloor(bldg.floors.get(5));          // case 2
		assertEquals(2,bldg.services(bldg.floors.get(5),bldg.floors.get(2)));
		
		System.out.println("---------------------------------------------");
		
		bldg.elev.setCurrentFloor(bldg.floors.get(5));          // case 3
		assertEquals(0,bldg.services(bldg.floors.get(5),bldg.floors.get(0)));
		
		System.out.println("---------------------------------------------");
		
		
		
	}

}
