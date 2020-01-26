package operators;

/*
 * (1) Write a program that uses the "short" and long form of print statement
 * 
 * (2) Create a class containing a float and use it to demonstrate aliasing
 * 
 * (3) Create a class containing a float and use it to demonstrate aliasing during
 * method calls
 * 
 * (4) Write a program that calculates velocity using a constant distance
 * and a constant time
 * 
 * (5)Create a class called Dog containing two Strings: name and says.
 * In main(), create two dog objects with names "spot" (who says "Ruff!") and
 * "scruffy" (who says "Wurf!").  Then display their names and what they say.
 * 
 * (6)Create a class called Dog containing two Strings: name and says.
 * Following exercise 5, create a new Dog reference and assign it to spot's
 * object. Test for comparison using == and equals() for all references.
 * 
 * (7)Write a program that simulates coin-flipping
 * 
 * (8)Show that hex and octal notations work with long values.
 * Use Long.toBinaryString to display the results.
 * 
 * (9)Display the largest and smallest numbers for both float and double 
 * exponential notation.
 * 
 * (10)Write a program with two constant values, one with alternating binary ones and
 * zeroes, with a zero in the least-significant digit, and the second, also
 * alternating, with a one in the least-significant digit (hint: It's easiest to 
 * use hexadecimal constants for this). Take these two values and combine them in
 * all possible ways using the bitwise operators, and display the results using
 * Integer.toBinaryString().
 * 
 * (11) Start with a number that has a binary one in the most significant position
 * (hint: Use a hexadecimal constant). Using the signed right-shift operator,
 * right shift it all the way through all of its binary positions each time
 * displaying the result using Integer.toBinaryString().
 * 
 * (12) Start with a number that is all binary ones. Left shift it, then use the
 * unsigned right-shift operator to right shift through all of its binary
 * positions, each time displaying the result using Integer.toBinarySting().
 *
 * (13)Write a method that displays char values in binary form. Demonstrate it
 * using several different characters
 * 
 * (14) Write a method that takes two String arguments uses all the boolean
 * comparisons to compare the two Stings and print the results. For the == and
 * !=, also perform the equals() test. In main(), test your method with some
 * different String objects.
 */

import static net.mindview.util.Print.*;

public class Main 
{

	public static void main(String[] args) 
	{
		//shortAndLongPrint();
		//demonstrateAliasing();
		//demonstradeAliasingDuringMethodCalls();
		//calculateVelocity(1.2334f, 5.4234f);
		//testDogs();
		//tossCoin();
		//testHexAndOctal();
		//largestAndSmallest();
		//binaryTest();
		//rightShiftOperatorUsing();
		//leftShiftOperatorUsing();
		//charBinary();
		//stringTest("test", "tset");
	}
	
	static void shortAndLongPrint()
	{
		print("Hello, from short form.");
		System.out.println("Hello from long form.");
	}
	
	static void demonstrateAliasing()
	{
		Tube t1 = new Tube();
		Tube t2 = new Tube();
		t1.level = 0.9f;
		t2.level = 0.47f;
		System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1 = t2;
		System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);		
		t1.level = 0.27f; 
		System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
	}
	
	static void demonstradeAliasingDuringMethodCalls()
	{
		Box x = new Box();
		x.a = 2.75f;
		System.out.println("1: x.a = " + x.a);
		methodCaller(x);	
		System.out.println("2: x.a = " + x.a);
	}
	
	static void methodCaller(Box b)
	{
		b.a = 3.14f;
	}
	
	static void calculateVelocity(float d, float t)
	{
		System.out.println("Distance: " + d);
		System.out.println("Time: " + t);
		System.out.println("Velocity: " + VelocityCalculator.velocity(d, t));
	}
	
	static void testDogs()
	{
		Dog spot = new Dog();
		spot.setName("Spot");
		spot.setSays("Ruff!");
		Dog scruffy = new Dog();
		scruffy.setName("Scruffy");
		scruffy.setSays("Wurf!");
		System.out.println(spot.getName());
		spot.speak();
		System.out.println(scruffy.getName());
		scruffy.speak();
		Dog butch = new Dog();
		butch.setName("Butch");
		butch.setSays("Hello!");
		System.out.println(butch.getName());
		butch.speak();
		System.out.println("Comparison: ");
		System.out.println("spot == butch: " + (spot == butch));
		System.out.println("spot.equals(butch): " + spot.equals(butch));
		System.out.println("butch.equals(spot): " + butch.equals(spot));
		System.out.println("Now assign: spot = butch");
		spot = butch;
		System.out.println("Compare again: ");
		System.out.println("spot == butch: " + (spot == butch));
		System.out.println("spot.equals(butch): " + spot.equals(butch));
		System.out.println("butch.equals(spot): " + butch.equals(spot));
		System.out.println("Spot: ");
		System.out.println(spot.getName());
		spot.speak();
		System.out.println("Butch: ");
		System.out.println(butch.getName());
		butch.speak();
		
	}
	
	static void tossCoin()
	{
		CoinFlipper cf = new CoinFlipper();
		cf.flip();
		cf.flip();
		cf.flip();
	}
	
	static void testHexAndOctal()
	{
		long n1 = 0xffff; // hexadecimal
		long n2 = 077777; // octal
		System.out.println("long n1 in hex = " + Long.toBinaryString(n1));
		System.out.println("long n2 in oct = " + Long.toBinaryString(n2));
	}
	
	static void largestAndSmallest()
	{
		double max = Double.MAX_VALUE;
		System.out.println("Max double = " + max);
		double min = Double.MIN_VALUE; 
		System.out.println("Min double = " + min);
		float maxf = Float.MAX_VALUE;
		System.out.println("Max float = " + maxf);
		float minf = Float.MIN_VALUE; 
		System.out.println("Min float = " + minf);
	}
	
	static void binaryTest()
	{
		int i = 1 + 4 + 16 + 64;
		int j = 2 + 8 + 32 + 128;
		System.out.println("i = " + Integer.toBinaryString(i));
		System.out.println("j = " + Integer.toBinaryString(j));
		System.out.println("i & j = " + Integer.toBinaryString(i & j));
		System.out.println("i | j = " + Integer.toBinaryString(i | j));
		System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j));
		System.out.println("~i = " + Integer.toBinaryString(~i));
		System.out.println("~j = " + Integer.toBinaryString(~j));
	}
	
	static void rightShiftOperatorUsing()
	{
		int h = 0x10000000;
		System.out.println(Integer.toBinaryString(h));
		for(int i = 0; i < 28; i++)
		{
			h >>>= 1;
			System.out.println(Integer.toBinaryString(h));
		}
	}
	
	static void leftShiftOperatorUsing()
	{
		int h = -1;
		System.out.println(Integer.toBinaryString(h));
		h <<= 10;
		System.out.println(Integer.toBinaryString(h));
		for(int i = 0; i < 32; i++)
		{
			h >>>= 1;
			System.out.println(Integer.toBinaryString(h));
		}
	}
	
	static void charBinary()
	{
		char c = 'a';
		System.out.println(Integer.toBinaryString(c));
		c = 'b';
		System.out.println(Integer.toBinaryString(c));
		c = 'c';
		System.out.println(Integer.toBinaryString(c));
		c = 'd';
		System.out.println(Integer.toBinaryString(c));
		c +=1;
		System.out.println(Integer.toBinaryString(c));
		c = 'A';
		System.out.println(Integer.toBinaryString(c));
		for(int i = 0; i < 26; i++) 
		{
			c +=1;
			System.out.println(Integer.toBinaryString(c));
		}
	}
	
	static void stringTest(String s, String t)
	{
		System.out.println(s == t);
		System.out.println(s.equals(t));
		System.out.println(t.equals(s));
		System.out.println(s != t);
	}	

}
