package domain;

/**
 * This class will contain a running list of categorizations available for the recipes in a
 * users' recipe book. For categories with quantities associated with them there will be
 * customization options for the user to determine which recipes are permissible within them.
 * Few recipes will not fall under any of these categories, but for those that might, there will
 * be an 'other' categorization provided.
 * 
 * @author Giovani Acosta
 *
 */

public enum Category {
	
	VEGAN, VEGETARIAN, LOWCAL, LOWCARB, GLUTENFREE, 
	NOBAKE, QUICK, CHEAP, RECENT, SIMPLE, 
	BREAKFAST, LUNCH, DINNER, DESSERT, SNACK,
	AMERICAN, MEXICAN, CHINESE, INDIAN, JAPANESE, MEDITERRANEAN,
	OTHER;
	
}
