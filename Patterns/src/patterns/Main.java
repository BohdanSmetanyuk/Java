package patterns;

public class Main
{
	public static void main(String[] args)
	{
		testSingleton();
		testFactoryMethod();
	}
	
	private static void testSingleton()
	{
		ClassSingleton obj1 = ClassSingleton.getInstance();
		ClassSingleton obj2 = ClassSingleton.getInstance();
		
		System.out.println(obj1 == obj2);
	}
	
	private static void testFactoryMethod()
	{
		ClassFactoryMethod obj = ClassFactoryMethod.getClassFactoryMethod();
		System.out.println(obj);
	}
	
}
