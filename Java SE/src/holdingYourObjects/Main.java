package holdingYourObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* (1)Create a new class called Gerbil with an int gerbilNumber that's 
 * initialized in the constructor. Give it a method called hop() that displays
 * which gerbil number that is, and that it's hopping. Create an ArrayList and 
 * add Gerbil objects to the List. Now use the get() method to move through
 * the List and call hop() for each Gerbil.
 * 
 * (2)Modify SimpleCollection.java to use a Set for c.
 * 
 * (4)Create a generator class that produces character names (as String objects)
 * from your favorite movie (you can use Snow White or Star Wars as a
 * fallback) each time you call next(), and loops around to the beginning of
 * the character list when it runs out of names. Use this generator to fill
 * an array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a
 * TreeSet, then print each container
*/
public class Main
{

	public static void main(String[] args) 
	{
		//testGerbil();
		//testModified();
		testGeneratorForFillContainers();
	}
	
	static void testGerbil()
	{
		List<Gerbil> gerbils = new ArrayList();
		for(int i=1; i<=10; i++)
			gerbils.add(new Gerbil(i));
		for(int i=0; i<gerbils.size(); i++)
			gerbils.get(i).hop();
	}
	
	static void testModified()
	{
		Set<Integer> c = new HashSet<Integer>();
		for(int i = 0; i < 10; i++)
			c.add(i); // "Автоупаковка"
		for(Integer i : c)
			System.out.print(i + " ");
	}
	
	static void testGeneratorForFillContainers()
	{
		Generator gen = new Generator();		
		String[] a = new String[10];
		gen.fillArray(a);
		for(String s : a) System.out.print(s + " ");
		System.out.println();	
		System.out.println(gen.fillCollection(new ArrayList<String>(), 10));
		System.out.println(gen.fillCollection(new LinkedList<String>(), 10));
		System.out.println(gen.fillCollection(new HashSet<String>(), 10));
		System.out.println(gen.fillCollection(new LinkedHashSet<String>(), 10));
		System.out.println(gen.fillCollection(new TreeSet<String>(), 10));
	}

}



