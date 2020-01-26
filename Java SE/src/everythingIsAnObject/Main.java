package everythingIsAnObject;

import java.util.Date;

/* (1)Create a class containing an int and a char that are not intitialized
 * and print their values to verify that Java performs default initialization.
 * 
 * (2)Following the HelloDate.java example in this chapter, create a "hello, world" 
 * program that simply displays that statement.
 * 
 * (3)Find the code fragments involving ATypeName and turn them into a program
 * that compiles and runs.
 * 
 * (4)Turn the DataOnly code fragments into a program that compiles and runs
 * 
 * 
 * (5)Modify the previous exercise so that the values of the data in DataOnly are
 * assigned to and printed in main().
 * 
 * (6)Write a program that includes and calls the storage() method defined as a
 * code fragment in this chapter.
 * 
 * (7)Turn the Incrementable code fragments into a working program.
 * 
 * 
 * (8)Write a program that demonstrates that, no matter how many objects you
 * create of a particular class, there is only one instance of a particular
 * static field of that class.
 * 
 * (9)Write a program that demonstrates that autoboxing works for all the primitive // types and their wrappers
 * 
 * (10)Write a program that prints three arguments taken from the command line. To do // this you'll need to index into the command-line array of Strings.
 * 
 * (11)Turn the AllColorsOfTheRainbow into a program that compiles and runs.
 * 
 * (12)Find the code for the second version of HelloDate.java, which is the simple
 * comment documentation example. Execute Javadoc on the file and view the
 * results with your Web browser.
 * 
 * (13) Run Documentation1.java, Documentation2.java and Documentation3.java 
 * through Javadoc. Verify the resulting documentation with your Web browser.
 * 
 * (14)Add an HTML list of items to the documentation in the previous exercise.
 * 
 * (15)Take the program in Exercise 2 and add comment documentation to it. Extract
 * this comment documentation into an HTML file using Javadoc and view it with
 * your Web browser.
 * 
 * (16)In the Initialization and Cleanup chapter, locate the Overloading.java
 * example and add Javadoc documentation. Extract this comment documentation
 * into and HTML file using Javadoc and view it with your Web browser.
 *
 */


/** 
 * @author Me
 * @version 1.0
 */

public class Main
{
	/**
	 * 
	 * @param args array of string arguments
	 * @throws exceptions No exceptions thrown
	 * 
	 */
	public static void main(String[] args)
	{
		//ClassWhisNonInitFields.getFields();
		//helloWorld();
		//testATypeName();
		//testDataOnly();
		//testStorage();
		//testIncrementable();
		//testStaticFields();
		//demonstradeAutoboxing();
		//printCommandLineArgs(args);
		//testAllTheColorsOfTheRainbow();
	}
	
	
	/** 
	 * @throws exception No Exceptions thrown
	 * 
	 */
	static void helloWorld()
	{
		System.out.println("Hello, world");
		System.out.println("It's: ");
		System.out.println(new Date());
	}
	
	static void testATypeName()
	{
		ATypeName obj = new ATypeName();
		obj.i = 100;
		obj.d = 100.001;
		obj.b = true;
		obj.show();
	}
	
	static void testDataOnly()
	{
		DataOnly obj = new DataOnly();
		obj.i = 100;
		obj.d = 100.001;
		obj.b = true;
		obj.show();
	}
	
	static void testStorage()
	{
		System.out.println(Storager.storage("Thingsboard")); 
	}
	
	static void testIncrementable()
	{
		StaticTest st1 = new StaticTest(), st2 = new StaticTest();
		System.out.println("st1.i = " + st1.i + "\nst2.i = " + st2.i);
		Incrementable.increment();
		System.out.println("st1.i = " + st1.i + "\nst2.i = " + st2.i);
		st1.i = 10;
		System.out.println("st1.i = " + st1.i + "\nst2.i = " + st2.i);
	}
	
	static void testStaticFields()
	{
		StaticTest st1 = new StaticTest(), st2 = new StaticTest();
		System.out.println("st1.i = " + st1.i + "\nst2.i = " + st2.i);
		Incrementable.increment();
		System.out.println("st1.i = " + st1.i + "\nst2.i = " + st2.i);
		st1.i = 10;
		System.out.println("st1.i = " + st1.i + "\nst2.i = " + st2.i);
		StaticTest st3 = new StaticTest();
		System.out.println("st3.i = " + st3.i);
	}
	
	static void demonstradeAutoboxing()
	{
		boolean b = false;
		char c = 'x';
		byte t = 8;
		short s = 16;
		int i = 32;
		long l = 64;
		float f = 0.32f;
		double d = 0.64;
		Boolean B = b;
		System.out.println("boolean b = " + b); 		
		System.out.println("Boolean B = " + B); 
		Character C = c;
		System.out.println("char c = " + c);
		System.out.println("Character C = " + C);
		Byte T = t;
		System.out.println("byte t = " + t);
		System.out.println("Byte T = " + T);
		Short S = s;
		System.out.println("short s = " + s);
		System.out.println("Short S = " + S);
		Integer I = i;
		System.out.println("int i = " + i);
		System.out.println("Integer I = " + I);
		Long L = l;
		System.out.println("long l = " + l);
		System.out.println("Long L = " + L);
		Float F = f;
		System.out.println("float f = " + f);
		System.out.println("Float F = " + F);
		Double D = d;
		System.out.println("double d = " + d);
		System.out.println("Double D = " + D);	
	}
	
	static void printCommandLineArgs(String[] args)
	{
		System.out.println("args[0] = " + args[0]);
		System.out.println("args[1] = " + args[1]);
		System.out.println("args[2] = " + args[2]);
	}
	
	static void testAllTheColorsOfTheRainbow()
	{
		AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
		System.out.println("atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);
		atc.changeColor(7);
		atc.changeTheHueOfTheColor(77);
		System.out.println("After color change, atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);
		System.out.println("atc.hue = " + atc.hue);
	}
	
}
