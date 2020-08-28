 /**
 * This class describes the BlockBehavior. It implements the interface DefenceBehavior and its play method
 * @author Jonathan Terry
 *
 */

import java.util.Random;

public class BlockBehavior implements DefenceBehavior {
	/**
	 * @return This method randomly returns a String that describes what happens during defence if BlockBehavior is chosen as the DefenceBehavior.
	 */
	public String play() {
		  Random r = new Random();
		  int i = r.nextInt(3);	
		
		  if(i == 0) {
			  return "blocks player from passing";
		  }
		
		  else if(i == 1) {
			  return "blocks player from shooting";
		  }
		
		  else if(i == 2) {
			  return "checks player with puck";
		  }
		  else {
			  return "error";
		  }
	  }
	
}
