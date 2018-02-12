package domain;

	/**
	 * This class will determine the Ingredient type for this program. This object will maintain
	 * a String name primarily, but also the quantity of the ingredient object specified.
	 * Because there may be many ways to measure the quantity of an item in one's pantry, this
	 * will specify item amounts held by the user in unspecified units that will be used by all
	 * ingredients across all recipes for the time being.
	 * 
	 * @author Giovani Acosta
	 *
	 */

public class Ingredient {

	String name;
	Double quantity;
	
	public Ingredient(String name, Double quantity) {
		
		this.name = name;
		this.quantity = quantity;
		
	}
	
}
