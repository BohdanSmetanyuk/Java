package controllingExecution;

class Counter
{
	static void count()
	{
		for(int i = 1; i <= 100; i++)
			System.out.println(i);
	}
	
	static void count2(int n) 
	{
		for(int i = 0; i < n; i++)
		{
			System.out.println(i);
			if(i == 99)
				break;
		}
	}
	static void count3(int n) 
	{
		for(int i = 0; i < n; i++) 
		{
			System.out.println(i);
			if(i == 99)
				return;
		}
	}
}
