
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestRoverControl {

	Rover rover1;
	String nasaMsg1 ;
	Rover rover2;
	String nasaMsg2 ;
	int plateauPosition ;
	
	private RoverControl rc;

    @Before
    public void init() {
    	
    	rc = new RoverControl ();
    	 
    	rover1 = new Rover (1,2,'N');
    	nasaMsg1 = "LMLMLMLMM";
    	rover2 = new Rover (3,3,'E');
    	nasaMsg2 = "MMRMMRMRRM";
    	plateauPosition= 5 ;
       
    }


    @Test
    public void shouldControlRover() {
    	
    	rover1 = rc.controlRover(plateauPosition, rover1, nasaMsg1);
    	rover2 = rc.controlRover(plateauPosition, rover2, nasaMsg2);
    	assertEquals(rover1.toString(),"1 3 N");
    	assertEquals(rover2.toString(),"5 1 E");
       
    }
	
}
