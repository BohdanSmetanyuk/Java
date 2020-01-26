package controllingExecution;

import java.util.Random;

public class IntComparer 
{
	static void compare()
	{
		Random rand = new Random();
		int x, y;
		while(true)
		//for(int i=0; i<25; i++)
		{
			x = rand.nextInt(25);
			y = rand.nextInt(25);
			if(x > y)
				System.out.println(x + " > " + y);
			else if(x < y)
				System.out.println(x + " < " + y);
			else
				System.out.println(x + " == " + y);
		}
	}
	
	
}
