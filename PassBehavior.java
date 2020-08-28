/**
 * This class describes the PassBehavior. It implements the interface OffenceBehavior and its play method
 * @author Jonathan Terry
 *
 */

public class PassBehavior implements OffenceBehavior {
	/**
	 * @return This method randomly returns a String that describes what happens during offence if PassBehavior is chosen as the OffenceBehavior.
	 */
	public String play() {
		  return "passes to a forward";
	}

}
