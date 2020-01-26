package polymorphism;

/* (1)Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. 
* Demonstrate that an instance of each type can be upcast to Cycle via a ride()
* method.
* 
* (2)Add the @Override annotation to the Shapes example
* 
* (3)Add a new method in the base class of Shapes.java that prints a message, but
* don't override it in the derived classes. Explain what happens. Now override
* it in one of the derived classes but not the others and see what happens. 
* Finally override it in all the derived classes.
* 
* (4)Add a new shape to Shapes.java and verify in main() that polymorphism works
* for your new type as is does for the old types.
* 
* (5)Starting from Exercise 1, add a wheels() method in Cycle, which returns the
* number of wheels. Modify ride() to call wheels() and verify that polymorphism
* works.
* 
* (6)
*/

public class Main 
{
	public static void main(String[] args) 
	{
		testCycle();
		testShape();
	}
	
	private static void testCycle()
	{
		demonstrade(new Cycle());
		demonstrade(new Unicycle());
		demonstrade(new Bicycle());
		demonstrade(new Tricycle());
	}
	
	private static void demonstrade(Cycle c)
	{
		c.ride();
	}
	
	private static void testShape()
	{
		RandomShapeGenerator gen = new RandomShapeGenerator();
		Shape[] shapes = new Shape[10];
		for(int i=0; i<shapes.length; i++)
			shapes[i] = gen.next();
		for(Shape shape: shapes)
		{	
			shape.draw();
			shape.testMethod();
		}
	}
}
