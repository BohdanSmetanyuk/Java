package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import net.mindview.util.*;

/* (1)Create a List (try both ArrayList and LinkedList) and fill it using
 * Countries. Sort the list and print it, then apply Collections.shuffle()
 * to the list repeatedly, printing it each time so that you can see how 
 * the shuffle() method randomizes the list differently each time
 */

public class Main {

	public static void main(String[] args)
	{
		//testListFillingCountries();
	}
	
	static void testListFillingCountries()
	{
		List<String> al = new ArrayList<String>();
		List<String> ll = new LinkedList<String>();
		for(int i = 0; i < Countries.DATA.length; i++) 
		{
			al.add(Countries.DATA[i][0]);
			ll.add(Countries.DATA[i][1]);
		}
		Collections.sort(al);
		Collections.sort(ll);
		System.out.println("Countries: " + al);
		System.out.println("Capitals: " + ll);
		for(int i = 0; i < 2; i++)
		{
			Collections.shuffle(al);
			Collections.shuffle(ll);
			System.out.println("Countries " + i + ": " + al);
			System.out.println("Capitals " + i + ": " + ll);
		}
		List<String> al2 = new ArrayList<String>();
		List<String> ll2 = new LinkedList<String>();
		for(int i = 0; i < 10; i++)
		{
			al2.add(Countries.DATA[i][0]);
			ll2.add(Countries.DATA[i][1]);
		}
		for(int i = 0; i < 5; i++)
		{
			Collections.shuffle(al2);
			Collections.shuffle(ll2);
			System.out.println("Countries " + i + ": " + al2);
			System.out.println("Capitals " + i + ": " + ll2);
			Collections.sort(al2);
			Collections.sort(ll2);
		}
	}

}
