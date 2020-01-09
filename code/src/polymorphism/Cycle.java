package polymorphism;

public class Cycle
{
	private int wheels;
	
	Cycle()
	{
		
	}
	
	Cycle(int wheels)
	{
		this.wheels = wheels;
	}
	
	public void ride()
	{
		System.out.println(this + " is ridding on " + wheels() + " wheels.");
	}
	
	public int wheels()
	{
		return wheels;
	}
	
	public String toString()
	{
		return this.getClass().getSimpleName();
	}
}

class Unicycle extends Cycle
{
	Unicycle()
	{
		super(1);
	}
	
	@Override
	public void ride()
	{
		System.out.println(this + " is ridding on " + wheels() + " wheels.");
	}
}

class Bicycle extends Cycle
{
	Bicycle()
	{
		super(2);
	}
	@Override
	public void ride()
	{
		System.out.println(this + " is ridding on " + wheels() + " wheels.");
	}
}

class Tricycle extends Cycle
{
	Tricycle()
	{
		super(3);
	}
	@Override
	public void ride()
	{
		System.out.println(this + "is ridding on " + wheels() + " wheels.");
	}
}
