package strings;

import java.util.Map;
import java.util.HashMap;

public class FrequencyDictionaryLetters 
{
	
	private static Map<Character, Integer> buildDictionary(String text, boolean toLowerCase)
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
	
	public static void main(String[] args)
	{
		System.out.println(buildDictionary("ZadffhvfdfgergDFDGvdssghdfgbqtrptytikfbmdlvspdkqjcncqsxZzqqsclsdvmk", true));
		System.out.println(buildDictionary("zZZzaA", false));
	}
}
