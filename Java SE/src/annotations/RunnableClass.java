package annotations;

@Repeat(count = 5)
public class RunnableClass implements Runnable
{

	@Override
	public void run()
	{
		System.out.println("Still running");
	}

}
