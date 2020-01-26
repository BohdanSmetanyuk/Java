package enumeratedTypes;

import java.util.Random;

/*
 * 
 * (1)Use a static import to modify TrafficLight.java so you 
 * don't have to qualify the enum instances.
 * 
 * (2)Instead of implementing an interface, make next() a static 
 * method. What are the benefits and drawbacks of this approach?
 * 
 * (3)Add a new Course to Course.java and demonstrate that it works in Meal.java.
 * 
 * (4)Repeat the above (EX 3) for Meal2.java
 * 
 * (5)Modify contol/VowelsAndConsonants.java so that it uses three enum types:
 * VOWEL, SOMETIMES_A_VOWEL, and, CONSONANT. The enum constructor should
 * take the various letters that describe that particular category. Hint: 
 * use varargs, and remember that varargs automatically creates an array
 * for you
 * 
 * (6)Is there any special benefit in nexting Appetizer, MainCourse, Dessert, and 
 * Coffee inside Food rather than making them standalone enums that just happen
 * to implement Food?
 * 
 * (7)Find the source code for EnumSet and explain how it works.
 */

public class Main 
{

	public static void main(String[] args)
	{
		//testTrafficLighter();
		//testCartoonCharacter();
		//Meal.testMeal();
		testVowelsAndConsonants();
	}
	
	static void testTrafficLighter()
	{
		TrafficLight t = new TrafficLight();
		for(int i=0; i<10; i++)
		{
			System.out.println(t);
			t.change();
		}
	}
	
	static void testCartoonCharacter()
	{
		CartoonCharacter cc = CartoonCharacter.SLAPPY;
		for(int i=0; i< 6; i++)
		{
			System.out.println(cc);
			cc = cc.next();
		}
	}
	
	static void testVowelsAndConsonants()
	{
		Random rand = new Random();
		for(int i = 0; i < 100; i++) 
		{
			int c = rand.nextInt(26) + 'a';
			System.out.println((char)c + ", " + c + ": "); 
			System.out.println(VowelsAndConsonants.letterType((char)c));			
		}	
	}
	
	

}
