package shoppingList;

import java.util.Comparator;
import java.util.LinkedList;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;

public class MealWheel {

	public static void main(String[] args) {
		String filename = "src/Resources/MealList.csv";
		In in = new In(filename);
		LinkedList<Meal> mealWheel = new LinkedList<>();
		LinkedList<Ingredient> shoppingList = new LinkedList<>();
		
		while(in.hasNextLine()) {
			String line = in.readLine();
			String[] details = line.split(",");
			mealWheel.add(new Meal(details[0]));
			for (int i = 1; i < details.length; i++)
				mealWheel.get(mealWheel.size()-1).addIngredient(new Ingredient(details[i]));
		}
		
//		Meal chosenMeal = mealWheel.get(mealWheel.size()-1);
		
		for (Meal meal : mealWheel) {
			if (meal.mealName().charAt(0) == '*') {
				Meal chosenMeal = meal;
//				mealWheel.remove(chosenMeal);
				System.out.println();
				System.out.println(chosenMeal.toString());
				for (String ingredient : chosenMeal.ingredients().keys()) {
					System.out.println(ingredient + " " + chosenMeal.ingredients().get(ingredient).measure());
					shoppingList.add(chosenMeal.ingredients().get(ingredient));
				}
				meal.deselect();
			}
		}
		
		shoppingList.sort(Comparator.naturalOrder());
		System.out.println("\nShopping List: " + shoppingList.size());
		for (int i = 0; i < shoppingList.size(); i++) {
			System.out.println(shoppingList.get(i).name() + " " + shoppingList.get(i).measure());
		}
	}
}
