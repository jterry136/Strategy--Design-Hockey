/**
 * This class describes the BlockGoalBehavior. It implements the interfaces DefenceBehavior and OffenceBehavior as well as their play method
 * @author Jonathan Terry
 *
 */
 
import java.util.Random;

public class BlockGoalBehavior implements OffenceBehavior, DefenceBehavior {

	/**
	 * @return This method randomly returns a String that describes what happens when the Goalie's play method is called. 
	 * There is no specification on offence or defence as this behavior is implemented on both for the Goalie
	 */
	public String play() {
		  Random r = new Random();
		  int i = r.nextInt(4);
		
		  if(i == 0) {
			  return"hand blocks the puck";
		  }
			
		  else if(i == 1) {
			  return "catches the puck";
		  }
			
		  else if(i == 2) {
			  return "blocks puck with knee pads";
		  }
			
		  else if(i == 3) {
			  return "blocks puck with stick";
		  }
		
		  else {
			  return "error";
		  }
	  }
	
}
