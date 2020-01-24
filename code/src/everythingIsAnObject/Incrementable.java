package everythingIsAnObject;

public class Incrementable
{
	static void increment()
	{
		StaticTest.i++;
	}
}

class StaticTest
{
	static int i=0;
}