package typeInformation;

import java.util.Arrays;
import java.util.List;

public abstract class Shape 
{
	public void draw()
	{
		System.out.println(this + ".draw();");
	}
	
	abstract public String toString();
}


class Circle extends Shape
{
	boolean flag = false;
	public String toString() 
	{ 
		return (flag ? "H" : "Unh") + "ighlighted " + "Circle"; 
	}
}

class Square extends Shape
{
	boolean flag = false;
	public String toString() 
	{
		return (flag ? "H" : "Unh") + "ighlighted " + "Square"; 
	}
}

class Triangle extends Shape 
{
	boolean flag = false;
	public String toString() 
	{ 
		return (flag ? "H" : "Unh") + "ighlighted " + "Triangle";
	}
}

class Rhomboid extends Shape 
{
	boolean flag = false;
	public String toString() 
	{ 
		return (flag ? "H" : "Unh") + "ighlighted " + "Rhomboid"; 
	}
}

class TestShapes
{
	static void setFlag(Shape s)
	{
		if(s instanceof Triangle)
			((Triangle)s).flag = true; 
	}			
	
	static void rotate(Shape s)
	{
		if(!(s instanceof Circle))
			System.out.println(s + " rotate");
	}			
	
	static void testShapes()
	{
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
		
		for (Shape shape: shapeList)
			shape.draw();
		
		Rhomboid r = new Rhomboid();
		// Upcast:
		Shape s = (Shape)r;
		s.draw();
		// check type before downcast:
		if(s instanceof Circle) 
			((Circle)s).draw();
		else
			System.out.println("(Shape)r is not a Circle");	
		for(Shape shape: shapeList)
			rotate(shape);
		for(Shape shape : shapeList)
		{
			setFlag(shape);
			System.out.println(shape);
		}
	}
}