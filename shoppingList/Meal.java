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
}
