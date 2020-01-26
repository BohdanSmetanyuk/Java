package typeInformation;

/*
 * (1)In ToyTest.java, comment out Toy's default constructor and
 * explain what happens
 * 
 * (2)Incorporate a new kind of interface into ToyTest.java and
 * verify that it is detected and displayed properly.
 * 
 * (3) Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a Shape,
 * then downcast it back to a Rhomboid. Try downcasting to a Circle and
 * see what happens.
 * 
 * 
 * (4)Modify the previous exercise so that it uses instanceof to check the
 * type before performing the downcast.
 * 
 * (5)Implement a rotate(Shape) method in Shapes.java, such that it checks
 * to see if it is rotating a Circle (and, if so, doesn't perform the
 * operation).
 * 
 * (6)Modify Shapes.java so that it can "highlight" (set a flag in)
 * all shapes of a particular type.  The toString() method for each 
 * derived Shape should indicate whether that Shape is "highlighted.
 * 
 * (7)Modify SweetShop.java so that each type of object creation is controlled
 * by a command-line argument. That is, if your command line is "java 
 * SweetShop Candy," then only the Candy object is created. Notice how you 
 * can control which Class object are loaded via the command-line argument.
 * 
 * 
 * (8)Write a method that takes an object and recursively prints all 
 * the classes in that object's hierarchy.
 * 
 * (9)Modify the previous exercise so that it uses Class.getDeclaredFields() 
 * to also display information about the fields in a class.
 * 
 * (10)Write a program to determine whether an array of char is a primitive type
 * or a true Object.
 * 
 * (11)In ToyTest.java, use reflection to create a Toy object using
 * the non-default constructor.
 * 
 */

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main 
{

	public static void main(String[] args)
	{
		//ToyTest.toyTest();
		//TestShapes.testShapes();
		//hierarchy(new C());
		//determine();
		createToyObject();
	}
	
	@SuppressWarnings("deprecation")
	static void hierarchy(Object o)
	{
		
		Class<?> cc = o.getClass();
		System.out.println(cc.getSimpleName());
		
		Field[] fields = cc.getDeclaredFields();
		if(fields.length != 0)
		{
			for(Field field: fields)
				System.out.println(field);
		}
		else
			System.out.println("Class has no fields");
		
		
		cc = cc.getSuperclass();	
		if(cc != null)
			try 
			{
				hierarchy(cc.newInstance());
			} 
			catch (InstantiationException | IllegalAccessException e) 
			{
				System.err.println(e.getMessage());
			}	
	}
	
	static void determine()
	{
		char[] c = new char[10];
		System.out.println(c.getClass());
		System.out.println("Superclass of char[] c: " + 
			c.getClass().getSuperclass());
		System.out.println("char[] c instanceof Object: " + 
			(c instanceof Object));
	}
	
	static void createToyObject()
	{
		try 
		{
			Toy toy1 = Toy.class.getDeclaredConstructor().newInstance();
			Toy toy2 = Toy.class.getDeclaredConstructor(int.class).newInstance(1);
		}
		catch (InstantiationException | IllegalAccessException e)
		{
			e.printStackTrace();
		} catch (IllegalArgumentException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InvocationTargetException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (NoSuchMethodException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
