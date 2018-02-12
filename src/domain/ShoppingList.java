package domain;

import java.util.ArrayList;

/**
 * This class will maintain the list of ingredients necessary for aqcuisition by the user
 * should they indicate to the program that they would like to prepare a recipe that they don't
 * currently have the ingredients for. It will be able to maintain the list of ingredients for
 * multiple recipes, both listed per recipe or as a sum of the ingredients required for all
 * recipes.
 * 
 * @author Giovani Acosta
 *
 */

public class ShoppingList {
	
	ArrayList<Ingredient> ingredients;
	
	
	public ShoppingList(ArrayList<String> ingredients) {
		
		ingredients = new ArrayList<String>();
		
	}
	
	/*
	 * These methods are to be used by the program to add the ingredients listed in the recipes
	 * chosen by the user that they do not have in their pantries.
	 */
	
	private void recipeAdd(Recipe rec) {
		
	}
	
	/*
	 * This method will be used by users to manually add their own ingredients for unspecified
	 * recipes or personal needs. 
	 */
	
	private void manualAdd(ArrayList<Ingredient> ing) {
		
	}

}
