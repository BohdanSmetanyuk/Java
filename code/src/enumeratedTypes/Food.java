package enumeratedTypes;

import net.mindview.util.*;



enum Course
{
	APPETIZER(Food.Appetizer.class),
	MAINCOURSE(Food.MainCourse.class),
	SECONDCOURSE(Food.SecondCourse.class), // added Course
	DESSERT(Food.Dessert.class),
	COFFEE(Food.Coffee.class);
	private Food[] values;
	private Course(Class<? extends Food> kind)
	{
		values = kind.getEnumConstants();
	}
	public Food randomSelection() {
		return Enums.random(values);
	}
}

public interface Food
{
	enum Appetizer implements Food
	{
		SALAD, SOUP, SPRING_ROLLS;
	}
	enum MainCourse implements Food
	{
		LASAGNE, BURRITO, PAD_THAI,
		LENTILS, HUMMOUS, VINDALOO;
	}
	enum SecondCourse implements Food
	{
		LEG_OF_LAMB, NEW_YORK_STEAK, 
		MAINE_LOBSTER, ALASKAN_KING_CRAB;
	}
	enum Dessert implements Food
	{
		TIRAMISU, GELATO, BLACK_FOREST_CAKE,
		FRUIT, CREME_CARAMEL;
	}
	enum Coffee implements Food
	{
		BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
		LATTE, CAPPUCCINO, TEA, HERB_TEA;
	}
}

