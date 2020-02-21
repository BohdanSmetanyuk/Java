package patterns;

public class Main
{
	public static void main(String[] args)
	{
		//testSingleton();
		//testFactoryMethod();
		testBuilder();
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
	
	private static void testBuilder() {
		ClassBuilder obj = new ClassBuilder.Builder(10, 10).calories(10).sodium(10).carbohydrate(10).build();
		System.out.println(obj);
	}
	
}
