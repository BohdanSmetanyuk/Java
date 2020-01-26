package enumeratedTypes;

import java.util.Random;

public enum CartoonCharacter 
{
	SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
	private static Random rand = new Random();
	public CartoonCharacter next()
	{
		return values()[this.ordinal()+1];
		//return values()[rand.nextInt(values().length)];
	}
}
