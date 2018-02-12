package domain;

import java.awt.Image;
import java.util.ArrayList;

/**
 * The Recipe class is the data maintained for every recipe maintained in the program. It
 * maintains ingredients, categories. an image of the recipe, instructions, rating, time to prep
 * and cook, etc. The shopping list and many other functions of the program rely on the data
 * contained in the recipe class to pull from, thus this is meant to be comprehensive in scope.
 * 
 * @author Giovani Acosta
 *
 */

public class Recipe {

	ArrayList<Ingredient> ingredients;
	ArrayList<Category> categories;
	Image img;
	String instructions;
	Double rating;
	int minsToPrep;
	int minsToCook;
	
	public Recipe(ArrayList<Ingredient> ingredients, ArrayList<Category> categories, Image img, String instructions, Double rating, int minsToPrep, int minsToCook) {
		
		ingredients = this.ingredients;
		categories = this.categories;
		img = this.img;
		instructions = this.instructions;
		rating = this.rating;
		minsToPrep = this.minsToPrep;
		minsToCook = this.minsToCook;
		
	}
	
	/*
	 * This method is meant to provide customization options to a recipe for the user.They
	 * will indicate the types and amounts of changes to the ingredients list and they will be
	 * changed in the book.
	 */
	
	private void changeIngredients() {
		
	}
	
}
