package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collections
{

	public static void main(String[] args)
	{
		//System.out.println(buildFrequencyDictionary("sdfcSFGGBCdfsdfdscsdCSDDGFFGScbghfhyjfdgnUGKUDNSsdfvdfvawrhRYKMKYIm", false));
		//Collection<Integer> collection = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 5, 6, 7, 7, 8);
		//System.out.println(deleteDublicates(collection));
		//testLists();
		Integer[] array = {1};
		ArrayIterator<Integer> iter = new ArrayIterator<Integer>(array);
		iter.next();
	}
	
	public static Map<Character, Integer> buildFrequencyDictionary(String text, boolean toLowerCase)
	{
		if(toLowerCase)
			text = text.toLowerCase();

		Map<Character, Integer> dict = new HashMap<Character, Integer>();

		for(int i=0; i < text.length(); i++)
		{
			char c = text.charAt(i);
			//dict.put(c, dict.containsKey(c) ? dict.get(c)+1 : 1);
			if(dict.containsKey(c))
				dict.replace(c, dict.get(c)+1);
			else
				dict.put(c, 1);
		}
		return dict;
	}
	
	public static <T> Collection<T> deleteDublicates(Collection<T> collection)
	{
		return new HashSet<>(collection);
	}
	
	private static void testLists()
	{
		List<Integer> arrList = new ArrayList<Integer>();
		List<Integer> linkList = new LinkedList<Integer>();
		fillList(arrList);
		fillList(linkList);
		getFromList(arrList);
		getFromList(linkList);
	}
	
	private static void fillList(List<Integer> list)
	{
		Random rand = new Random();
		
		long start = System.nanoTime();
		for(int i=0; i < 1000000; i++)
			list.add(rand.nextInt(1000));
		long finish = System.nanoTime();
		
		System.out.println("Filling Time: " + (finish-start) + " Type: " + list.getClass().getSimpleName());
	}
	
	private static void getFromList(List<Integer> list)
	{
		Random rand = new Random();
		
		long start = System.nanoTime();
		for(int i=0; i < 100000; i++)
			list.get(rand.nextInt(1000000));
		long finish = System.nanoTime();
		
		System.out.println("Getting Time: " + (finish-start) + " Type: " + list.getClass().getSimpleName());
	}


}
/* 1. ��������� ������� ����
 * 
 * �������:
 * buildFrequencyDictionary()
 * 
 * 2. ��������� ��� ����������
 * 
 * ������:
 * �������� �����, ������� �� ���� �������� ��������� ��������, � ���������� ��������� ��� ���
 * ����������.
 * 
 * �������:
 * deleteDublicates()
 * 
 * 3. ArrayList � LinkedList
 * 
 * ������:
 * �������� �����, ������� ��������� 1000000 ��������� � ArrayList � LinkedList. �������� ��� ����
 * �����, ������� �������� �� ������������ ������ ������� ������ 100000 ���. �������� �����, �������
 * ��������� �� ���. �������� ���������� � ������������, ������ ��� ������ �����.
 * 
 * �������:
 * testLists(), fillList(), getFromList()
 * 
 * 4. �������� �������� �� �������
 */



