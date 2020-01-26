package controllingExecution;

public class Fibonacci 
{
	static int fibonacci(int n) 
	{
		if(n < 2)
			return 1;
		return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
