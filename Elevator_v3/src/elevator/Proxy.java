package elevator;

public class Proxy {
	
	public int services(Building blg,Floor src,Floor dest){      // gives control to facade class
	                                                             // acts as proxy for other classes
		
		Facade fcd=new Facade();                
	    return fcd.services(blg,src,dest);    	
	    	
    }
	
}
