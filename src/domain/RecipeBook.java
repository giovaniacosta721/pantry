package domain;

import java.util.ArrayList;

/**
 * The recipe book is a list of recipes contained by the program, it may be sorted through by
 * category, ingredients list, prep time, etc, and it is meant to show every locally available
 * recipe to the user when they wish to see it, with real time updating from a database of
 * recipes should the ones shown to the users immediately not be sufficient. 
 * 
 * @author Giovani Acosta
 *
 */

public class RecipeBook {

	ArrayList<Recipe> book = new ArrayList<Recipe>();
	
	/*
	 * These methods will allow users to customize their personal recipe lists with their
	 * own recipes or remove those they may no longer want stored.
	 */
	
	private void add() {
		
	}
	
	private void remove() {
		
	}
	
}
