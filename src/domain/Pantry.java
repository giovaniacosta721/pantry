package domain;

import java.util.ArrayList;

/**
 * This class is the list of ingredients available to the user to use in recipes. For the
 * sake of simplicity, ingredients are listed in unspecified units as explained in the
 * Ingredient class.
 * 
 * @author Giovani Acosta
 *
 */

public class Pantry {

	ArrayList<Ingredient> ingredients;

	/*
	 * The constructor will take in the list of ingredients from a file containing names and
	 * quantities of ingredients retained by the user on start-up.
	 */

	public Pantry(ArrayList<Ingredient> ingredients) {

		this.ingredients = ingredients;

	}

	/*
	 * This method provides manual addition of ingredients into the user's pantry, in the case
	 * that barcode addition was not provided.
	 */

	private void add() {

	}

	/*
	 * This method provides manual removal of ingredients into the user's pantry in the case
	 * that recipes weren't chosen for completion or the user chose not to indicate recipe 
	 * completion in the program.
	 */

	private void remove() {

	}

}
