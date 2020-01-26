package enumeratedTypes;

public class Meal
{
	static void testMeal()
	{
		for(int i = 0; i < 5; i++)
		{
			for(Course course : Course.values()) {
				Food food = course.randomSelection();
				System.out.println(food);
			}
			System.out.println("---");
		}
	}
}
