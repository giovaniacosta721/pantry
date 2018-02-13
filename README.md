# pantry
Pantry inventory manager that lists recipes in categories available to user with items on hand.

This is a work in progress, with an ultimate goal of providing users a simple but functionally robust way of tracking items and ingredients
in their pantries and allow them to explore recipe options available to them with these items.

Application feature goals:

Recipe manager: Maintain a database of recipes, including user-input recipes and variables associated with them, e.g. ingredients list,
categorization(s), rating, prep and cook times, etc.

Pantry manager: Store and update ingredients held by user according to either manual input, barcode entry (approximated and verified by
user), or recipe usage.

Shopping list: Comprehensively lists ingredients needed by user to complete recipes selected in meal planning use case.

Ingredient substitutions: Replaces ingredients in search results with specified substitution, so as to not limit recipes available for
completion based on that ingredient, e.g. eggs replaced for banana mash by user; egg-containing recipes will still be listed as the user
will replace it with banana mash. Will display substitution in the recipe ingredients in amounts corresponding to user specified ratio of
ingredient:ingredient substituion. These substitutions will be marked with an asterisk for user to note.

Ingredient available recipes: Lists recipes that become available after purchase of one or more ingredients.

'Ingredient potential' search: Lists ingredients that will open up most potential recipes with single/double/triple ingredient purchase in
a given category.

Ingredient prioritization: Search for recipes featuring a given ingredient; use case for users looking to rid their pantries of
soon-to-expire or unwanted/abundant ingredients.

Reverse searches: Search for recipes within a given calorie/budget/category range.

Barcode input: Will list common grocery products under a given barcode, as there may be multiple products listed under the same code at
multiple franchises and present a prompt to confirm/deny the product shown, then present option to add to pantry. With use will begin to
learn stores user frequents.
