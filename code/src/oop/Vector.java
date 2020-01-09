package oop;

import java.util.Random;

public class Vector
{
	private double x;
	private double y;
	private double z;
	
	Vector(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double length()
	{
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	public double scalarProducing(Vector vector)
	{
		return this.x*vector.x + this.y * vector.y + this.z*vector.z;	
	}
	
	public Vector vectorProducing(Vector vector)
	{
		double newVectorX = this.y * vector.z - this.z * vector.y;
		double newVectorY = this.z * vector.x - this.x * vector.z;
		double newVectorZ = this.x * vector.y - this.y * vector.x;
		return new Vector(newVectorX, newVectorY, newVectorZ);
	}
	
	public double cos(Vector vector)
	{
		return scalarProducing(vector) / (this.length() * vector.length());
	}
	
	public Vector sum(Vector vector)
	{
		return new Vector(this.x + vector.x, this.y + vector.y, this.z + vector.z);
	}
	
	public Vector difference(Vector vector)
	{
		return new Vector(this.x - vector.x, this.y - vector.y, this.z - vector.z);
	}
	
	public static Vector[] vectorGenerator(int number)
	{
		Vector[] vectors = new Vector[number];
		Random rand = new Random();
		for(int i=0; i<vectors.length; i++)
			vectors[i] = new Vector(rand.nextDouble(), rand.nextDouble(), rand.nextDouble());
		return vectors;
	}
	
	public static void printVectors(Vector[] vectors)
	{
		for(Vector vector: vectors)
			System.out.println(vector);
	}
	
	@Override
	public String toString()
	{
		return String.format("Vector (%f, %f, %f)", this.x, this.y, this.z);
	}
	
	@Override
	public boolean equals(Object object)
	{
		if(this.getClass() == object.getClass())
		{
			Vector obj = (Vector)object;
			if(this.x == obj.x && this.y == obj.y && this.z == obj.z)
				return true;
			else
				return false;
		}
		else 
			return false;
	}
}
