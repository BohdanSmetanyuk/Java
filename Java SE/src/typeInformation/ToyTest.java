package typeInformation;

interface HasBatteries 
{
	
}

interface Waterproof 
{
	
}

interface Shoots
{
	
}

interface Speaking
{
	
}


class Toy
{
	Toy()
	{
		
	}
	void test()
	{
		
	}
	Toy(int i) 
	{
		
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Speaking
{

	FancyToy(int i) 
	{
		super(i);
	}
	
}

public class ToyTest 
{
	static void printInfo(Class cc)
	{
		System.out.println("Class name: " + cc.getName() +
			" is interface? [" + cc.isInterface() + "]");
		System.out.println("Simple name: " + cc.getSimpleName());
		System.out.println("Canonical name: " + cc.getCanonicalName());
	}
	
	@SuppressWarnings("deprecation")
	static void toyTest()
	{
		Class c = null;
		try 
		{
			c = Class.forName("typeInformation.FancyToy");
		} 
		catch(ClassNotFoundException e)
		{
			System.out.println("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for(Class face : c.getInterfaces())
			printInfo(face);
		Class up = c.getSuperclass();
		Object obj = null;
		try 
		{
			obj = up.newInstance();
		} 
		catch(InstantiationException e) 
		{
			System.out.println("Cannot instantiate");
			System.exit(1);
		} 
		catch(IllegalAccessException i)
		{
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}
