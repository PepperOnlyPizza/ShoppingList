package shoppingList;

public class Ingredient implements Comparable<Ingredient> {
	private String name;
	private double measurement;
	private String measureType;
	
	public Ingredient(String info) {
		String[] ingredientInfo = info.split("_");
		name = ingredientInfo[0];
		String[] measures = ingredientInfo[1].split("-");
		measurement = Double.parseDouble(measures[0]);
		measureType = measures[1];
	}
	
	public String name() {
		return name;
	}
	
	public String measure() {
		return measurement + "-" + measureType;
	}
	
	public double measurement() {
		return measurement;
	}
	
	public String measureType() {
		return measureType();
	}
	
	public void addMeasurement(double measurement) {
		this.measurement += measurement;
	}

	@Override
	public int compareTo(Ingredient other) {
		// TODO Auto-generated method stub
		return this.name().compareTo(other.name());
	}
}
