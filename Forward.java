/**
 * The class Forward is a child class of the abstract class player. It implements the inherited methods setOffenceBehavior and setDefenceBehavior
 * @author Jonathan Terry
 *
 */
import java.util.Random;

public class Forward extends Player {

	/**
	 * A parameterized constructor that creates an instance of the class Forward. It calls super to construct an abstract Player object, and then calls
	 * setOffenceBehavior and setDefenceBehavior to set the values of OffenceBehavior and DefenceBehavior.
	 * @param name The String name is intended to be used to identify unique instances of the class Forward
	 */
	public Forward(String name) {
		  super(name);
		  setOffenceBehavior();
		  setDefenceBehavior();
	  }
	
	/**
	 * This setter sets the value of OffenceBehavior for the class Forward. It will set the value of OffenceBehavior to either a PassBehavior or ShootBehavior object.
	 * We use a random object with a cap of 2 as we want the Forward to "choose" each behavior 50% of the time.
	 */
	public void setOffenceBehavior() {	//Pass and Shoot
		  Random r = new Random();
		  int i = r.nextInt(2);
		
		  if(i == 0) {
			  offenceBehavior = new PassBehavior();
		  }
		
		  else if(i == 1) {
			  offenceBehavior = new ShootBehavior();
		  }
	  }
	
	/**
	 * This setter sets the value of DefenceBehavior for the class Forward. It will set the value of DefenceBehavior to either a ChasePuckBehavior or BlockBehavior object.
	 * We use a random object with a cap of 2 as we want the Forward to "choose" each behavior 50% of the time.
	 */
	public void setDefenceBehavior() {
		  Random r = new Random();
		  int i = r.nextInt(2);
		
		  switch (i) {
		  case 0: 
			  defenceBehavior = new ChasePuckBehavior();
			
		  case 1: 
			  defenceBehavior= new BlockBehavior();
		  }		
	  }
	
	/**
	 * @return This method returns a String that describes the instance of the Forward class.
	 * The String tells us the unique name of the object and that they are a forward.
	 */
	public String toString() {
		  return this.name+" plays the position: Forward:";
	}
	
}
