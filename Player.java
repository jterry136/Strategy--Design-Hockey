/**
 * An abstract class that describes a generic player. This class has 3 children that inherit its properties.
 * Properties include a String called name, two interfaces that define the PLayer's Offence and Defence Behavior, and a boolean called offence that tells us if
 * the player is playing on offence or defence.
 * The term Player child object is used in this javaDoc to refer to the three classes Forward, Defenceman, and Goalie, which are children of this Player class.
 * @author Jonathan Terry
 *
 */
public abstract class Player {
	protected String name;
	private boolean offence;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	
	/**
	 * A parameterized constructor that creates an instance of Player with a given name, and sets the player's offence value to true.
	 * @param name The param name is a String type that is intended to be used to identify 
	 * each individual Player object or a Player child object
	 */
	public Player(String name) {
		  this.name = name;
		  this.offence = true;
	}
	
	/**
	 * An abstract class. While no implementation exists in the parent class, this class exists to force children to implement a method titled
	 * setDefenceBehavior that sets the DefenceBehavior of a Player object (or Player child object)
	 */
	public abstract void setDefenceBehavior();

	/**
	 * An abstract class. While no implementation exists in the parent class this class, like setDefenceBehavior, exists to force children to implement a method titled
	 * setOffenceBehavior that sets the OffenceBehavior of a Player object (or Player child object)
	 */
	public abstract void setOffenceBehavior();
	
	/**
	 * This method returns a String value that describes an action the player performs during either offence or defence, depending on the state of the offence boolean.
	 * Additionally, a try-catch block is used to handle NullPointerExceptions
	 * @return The String value returned by this method is derived from the play method of either the Offence or Defence behavior (depending on the state of the offence boolean)
	 *  set to the Player object (or Player child object)
	 */
	public String play() {	
		  String s = "";
		  try {
			  if(offence == true) {
				  s = offenceBehavior.play();
			  }
			  else if(offence == false) {
				  s = defenceBehavior.play();
			  }
			  else {
				  s = "error";
			  }
		  }
			
		  catch(Exception e) {
			    System.out.println("Error: "+e.getMessage());
		  }
		
		  return s;
	  }
	
	/**
	 * This method simply swaps the value of the offence boolean from true to false, and vice versa.
	 */
	public void turnover() {
		  offence = !offence;
	  }

	

}
