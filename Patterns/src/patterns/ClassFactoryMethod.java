package patterns;

public class ClassFactoryMethod
{
	private ClassFactoryMethod() {}
	
	public static ClassFactoryMethod getClassFactoryMethod()
	{
		return new ClassFactoryMethod();
	}
	
}
