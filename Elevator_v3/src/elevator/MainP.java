package elevator;


public class MainP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Building bldg=new Building(5);
		
		
		bldg.elev.setCurrentFloor(bldg.floors.get(0));          // case 1
		bldg.services(bldg.floors.get(3),bldg.floors.get(0));
		
		System.out.println("---------------------------------------------");
		
		bldg.elev.setCurrentFloor(bldg.floors.get(5));          // case 2
		bldg.services(bldg.floors.get(5),bldg.floors.get(2));
		
		System.out.println("---------------------------------------------");
		
		bldg.elev.setCurrentFloor(bldg.floors.get(5));          // case 3
		bldg.services(bldg.floors.get(5),bldg.floors.get(0));
		
	}

}
