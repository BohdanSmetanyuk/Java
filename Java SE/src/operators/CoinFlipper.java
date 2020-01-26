package operators;

import java.util.Random;

public class CoinFlipper
{
	private Random rand = new Random();
	void flip()
	{
		if(rand.nextInt() % 2 == 0)
			System.out.println("Heads");
		else
			System.out.println("Tails");
	}
}
