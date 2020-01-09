package polymorphism;

import java.util.Random;

public class Shape
{
	public void draw()
	{
		System.out.println("Shape.draw()");
	}
	
	public void erase()
	{
		System.out.println("Shape.erase()");
	}
	
	public void testMethod()
	{
		System.out.println("Shape.testMethod()");
	}
}

class Circle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Circle.draw()");
	}
	@Override
	public void erase()
	{
		System.out.println("Circle.erase()");
	}
	@Override
	public void testMethod()
	{
		System.out.println("Circle.testMethod()");
	}
}

class Triangle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Triangle.draw()");
	}
	@Override
	public void erase()
	{
		System.out.println("Triangle.erase()");
	}
	@Override
	public void testMethod()
	{
		System.out.println("Triangle.testMethod()");
	}
}

class Square extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Square.draw()");
	}
	@Override
	public void erase()
	{
		System.out.println("Square.erase()");
	}
	@Override
	public void testMethod()
	{
		System.out.println("Square.testMethod()");
	}
}

class RandomShapeGenerator
{
	private Random rand;
	
	RandomShapeGenerator()
	{
		rand = new Random();
	}
	
	public Shape next()
	{
		switch(rand.nextInt(3))
		{
			default: 
			case 0: return new Circle();
			case 1: return new Triangle();
			case 2: return new Square();
		}
	}
}

