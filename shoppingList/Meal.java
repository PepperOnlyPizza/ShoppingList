package shoppingList;

import edu.princeton.cs.algs4.RedBlackBST;

public class Meal {
	private RedBlackBST<String, Ingredient> ingredients;
	private String mealName;
	
	public Meal (String mealName) {
		ingredients = new RedBlackBST<>();
		this.mealName = mealName;
	}
	
	public void addIngredient(Ingredient ingredient) {
		ingredients.put(ingredient.name(), ingredient);
	}
	
	public String mealName() {
		return mealName;
	}
	
	public RedBlackBST<String, Ingredient> ingredients() {
		return ingredients;
	}
	
	public int ingredientSize() {
		return ingredients.size();
	}
	
	public void select() {
		if (!(mealName.charAt(0) == '*'))
			mealName = "*" + mealName;
	}
	
	public void deselect() {
		if (mealName.charAt(0) == '*')
			mealName = mealName.substring(1);
	}

	@Override
	public String toString() {
		if (mealName.charAt(0) == '*')
			return mealName.substring(1);
		else
			return mealName;
	}
}
