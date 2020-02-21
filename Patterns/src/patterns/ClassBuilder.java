package patterns;

public class ClassBuilder {
	
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	private ClassBuilder(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}
	
	public static class Builder {
		
		private final int servingSize;
		private final int servings;
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories (int val) {
			calories = val;
			return this;
		}
		
		public Builder fat(int val) {
			fat = val;
			return this;
		}
		
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		
		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}
		
		public ClassBuilder build() {
			return new ClassBuilder(this);
		}


	}
	
	@Override
	public String toString() {
		return "Serving size: " + servingSize +
				"\nServings: " + servings +
				"\nCalories: " + calories +
				"\nFat: " + fat +
				"\nSodium: " + sodium +
				"\nCarbohydrate: " + carbohydrate;
	}

}
