/**
 * This simple interface contains one method, and forces any implementing class to implement this method
 * @author Jonathan Terry
 *
 */

public interface DefenceBehavior {
	/**
	 * This method is not implemented in this interface. It exists to force any class that implements OffenceBehavior to also 
	 * implement this method.
	 * @return The return value of this method is intended to be a String that describes what a player does during either offence or defence. This depends on what
	 * the OffenceBehavior and DefenceBehavior of the player is set to.
	 */
	public String play();

}
