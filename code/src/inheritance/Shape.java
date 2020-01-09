package inheritance;

import java.util.ArrayList;

public class Shape
{
	private double volume;
	
	Shape(double volume)
	{
		this.volume = volume;
	}
	
	public double getVolume()
	{
		return volume;
	}
}

class SolidOfRevolution extends Shape
{
	private double radius;
	
	SolidOfRevolution(double volume, double radius)
	{
		super(volume);
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
}

class Cylinder extends SolidOfRevolution
{
	private double height;
	
	Cylinder(double radius, double height)
	{
		super(Math.PI * radius * radius * height, radius);
		this.height = height;
	}
	
}

class Ball extends SolidOfRevolution
{

	Ball(double radius)
	{
		super(Math.PI * Math.pow(radius, 3) * 4/3, radius);
	}
	
}

class Pyramid extends Shape
{
    private double height;
    private double s;

    public Pyramid(double height, double s)
    {
        super(height * s * 4/3);
        this.height = height;
        this.s = s;
    }
}

class Box extends Shape
{
	private double freeSpace;
	private ArrayList<Shape> shapes;

	Box(double freeSpace)
	{
		super(freeSpace);
		this.freeSpace = getVolume();
		shapes = new ArrayList();
	}
	
	public boolean add(Shape shape)
	{
		System.out.println("Volume of shape: " + shape.getVolume() + " Freespace: " + freeSpace);
		if(freeSpace >= shape.getVolume())
		{
			shapes.add(shape);
			freeSpace -= shape.getVolume();
			return true;
		}
		else
			return false;

	}
	
}



