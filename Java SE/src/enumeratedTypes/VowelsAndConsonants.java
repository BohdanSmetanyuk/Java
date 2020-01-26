package enumeratedTypes;

import java.util.Arrays;

public enum VowelsAndConsonants
{
	VOWEL('a', 'e', 'i', 'o', 'u'),
	SOMETIMES_A_VOWEL('w', 'y'),
	CONSONANT('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
		'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z');
	private Character[] letters;
	private VowelsAndConsonants(Character... letters) {
		this.letters = letters;
	}
	public static VowelsAndConsonants letterType(Character c) {
		if(Arrays.asList(VOWEL.letters).contains(c))
			return VOWEL;
		if(Arrays.asList(SOMETIMES_A_VOWEL.letters).contains(c)) 
			return SOMETIMES_A_VOWEL;
		return CONSONANT;
	}
}
