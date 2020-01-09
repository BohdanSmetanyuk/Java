package holdingYourObjects;

import java.util.Collection;

public class Generator 
{
	private int key = 0;
	public String next()
	{
		switch(key) {
			default:
			case 0 : key++; return "Darth Vader";
			case 1 : key++; return "Princess Leia";
			case 2 : key++; return "Han Solo";
			case 3 : key++; return "Luke Skywalker";
			case 4 : key++; return "Obi Wan Kenobi";
			case 5 : key++; return "Yoda";
			case 6 : key++; return "Darth Maul";
			case 7 : key = 0; return "Darth Sidious";			
		}
	} 
	public void fillArray(String[] array)
	{
		for(int i = 0; i < array.length; i++)
			array[i] = next();
	}
	
	public Collection fillCollection(Collection<String> collection, int number)
	{
		for(int i = 0; i < number; i++)
			collection.add(next());
		return collection;
	}
}