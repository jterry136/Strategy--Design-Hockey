
/**
 * The Goalie class is a child class of the abstract class Player. It implements the inherited methods setOffenceBehavior and setDefenceBehavior.
 * @author Jonathan Terry
 *
 */
public class Goalie extends Player {

	/**
	 * A parameterized constructor that creates an instance of the class Goalie. the constructor calls super to construct an abstract Player class parent with a name parameter,
	 * and then calls setters to set the values of OffenceBehavior and DefenceBehavior.
	 * @param name The param name is a String value that is intended to be used to identify individual instances of the Goalie class
	 */
	public Goalie(String name) {
		  super(name);
		  setOffenceBehavior();
		  setDefenceBehavior();
	  }
	/**
	 * The setOffenceBehavior for the Goalie class sets the OffenceBehavior to a new BlockGoalBehavior object.
	 */
	public void setOffenceBehavior() {
		  offenceBehavior = new BlockGoalBehavior();
	  }
	/**
	 * The set DefenceBehavior for the Goalie class sets the DefenceBehavior to a new BlockGoalBehavior object.
	 * It should be noted that both setters set to the same object. This is the case because in reality, goalies essentially
	 * perform the same function whether their team is on offence or defence.
	 */
	public void setDefenceBehavior() {
		  defenceBehavior = new BlockGoalBehavior();
		}
	
	/**
	 * @return This method returns a String value that describes the instance of the Goalie object.
	 * The String tells us the unique name of the player and tells us that they are a goalie.
	 */
	public String toString() {
		  return this.name+" plays the postion: Goalie";
		}

	
		
}

