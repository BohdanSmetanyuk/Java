package annotations;

public class Main {

	public static void main(String[] args)
	{
		Runnable command = new RunnableClass();
		CustomThreadPoolExecutor ctpe = new CustomThreadPoolExecutor(10);
		ctpe.execute(command);
	}

}
