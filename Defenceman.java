/**
 * The class Defenceman is a child class of the abstract class player. It implements the inherited methods setOffenceBehavior and setDefenceBehavior
 * @author Jonathan Terry
 *
 */
import java.util.Random;

public class Defenceman extends Player {
	
	/**
	 * A parameterized constructor that creates an instance of the class Defenceman. It calls super to construct an abstract Player object, and then calls
	 * setOffenceBehavior and setDefenceBehavior to set the values of OffenceBehavior and DefenceBehavior.
	 * @param name The String name is intended to be used to identify unique instances of the class Defenceman
	 */
	public Defenceman(String name) {
		  super(name);
		  setOffenceBehavior();
		  setDefenceBehavior();
	  }
	
	/**
	 * This setter sets the value of OffenceBehavior for the Defenceman class. It will set OffenceBehavior to either a PassBehavior or a Slapshot Behavior randomly.
	 * We use a random object with a cap of 10 because we want the Defenceman to "choose" PassBehavior 90% of the time.
	 */
	public void setOffenceBehavior() {
		  Random r = new Random();
		  int i = r.nextInt(10);
		  if(i <= 8) {
		    offenceBehavior = new PassBehavior();
		    System.out.println(i);
		  }
		  else if(i > 8) {
			offenceBehavior = new SlapShotBehavior();
		  }
	  }
	
	/**
	 * This setter sets the value DefenceBehavior for the Defenceman class. It will set DefenceBehavior to either a ChasePuckBehavior or a BlockBehavior randomly.
	 * We use a random object with a cap of 2 because we want the Defenceman to "choose" each behavior 50% of the time
	 */
	public void setDefenceBehavior() {	//ChasePuck and Block
		  Random r = new Random();
		  int i = r.nextInt(2);
		
		  if(i == 0) {
			  defenceBehavior = new ChasePuckBehavior();
		  }
		  else if(i == 1) {
			  defenceBehavior = new BlockBehavior();
		  }
	  }
	
	/**
	 * @return this method returns a String that describes the instance of the Defenceman object.
	 * The String tells us the unique name of the player and the fact that they are a Defenceman.
	 */
	public String toString() {
		  return this.name+" plays the position: Defenceman";
		}

}
