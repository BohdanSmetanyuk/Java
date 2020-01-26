package controllingExecution;

/*
 * (1)Write a program that prints values from 1 to 100
 * 
 * (2) Write a program that generates 25 random int values. For each value, use an
 * if-else statement to classify it as greater than, less than or equal to a
 * second randomly generated value.
 * 
 * (3)Modify exercise 2 wtih infinte while loop. Stop prgram with Ctrl-C
 * 
 * (4)Write a program that uses two nested for loops and the modulus operator (%)
 * to detect and print prime numbers.
 * 
 * (5) Modify the two test() methods in the previous two programs so that they take
 * two extra arguments begin and end, and so that testval is tested to see if it
 * is within the range between (and including) begin and end.
 * 
 * (6) Modify exercise 1 so that the program exits by using the break keyword at
 * value 99. Try using return instead. 
 * 
 * (7)Create a switch statement that prints a message for each case, and put the
 * switch inside a for loop that tries each case.  Put a break after each case
 * and test it, then remove the breaks and see what happens.
 * 
 * (8)A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34,
 * and so on, where each number (from the third on) is the sum of the previous
 * two. Create a method that takes an integer as an argument and displays that
 * many Fibonacci numbers starting from the beginning, e.g.,if you run java
 * Fibonacci 5 (where Fibonacci is the name of the class) the output will be
 * 1,1,2,3,5.
 * 
 * (9)A vampire number has an even number of digits and is formed by multiplying a
 * pair of numbers containing half the number of digits of the result. The
 * digits are taken from the original number in any order. Pairs of trailing
 * zeroes are not allowed. Examples include: 1260 = 21 * 60, 1827 = 21 * 87,
 * 2187 = 27  * 81. Write a program that finds all the 4-digit vampire numbers.
 * (Suggested by Dan Forhan.)
 */

public class Main 
{

	public static void main(String[] args)
	{
		//Counter.count();
		//IntComparer.compare();
		//PrimeDetector.detectPrimes();
		//System.out.println(test(5, 5, 5));
		//trySwitch();
		//for(int i=0; i<Integer.parseInt(args[0]); i++)
			//System.out.println(Fibonacci.fibonacci(i));
	}
	
	static int test(int testval, int begin, int end)
	{
		if(end < begin) {
			System.out.println("end cannot be < begin");
			return 0;
		} 
		if((testval > (begin - 1)) && (testval < (end + 1))) 
			return +1;
		if((testval < begin) || (testval > end))
			return -1;
		System.out.println("exceptional case");
		return 13;
	}
	
	static void trySwitch()
	{
		for(int i = 0; i < 11; i++)
		{	
			switch(i)
			{
				case 0: System.out.println("zero"); break;
				case 1: System.out.println("one"); break;
				case 2: System.out.println("two"); break;
				case 3: System.out.println("three"); break;
				case 4: System.out.println("four"); break;
				case 5: System.out.println("five"); break;
				case 6: System.out.println("six"); break;
				case 7: System.out.println("seven"); break;
				case 8: System.out.println("eight"); break;
				case 9: System.out.println("nine"); break;
				default: System.out.println("default");
			}
		}
	}
	
	static int fibonacci(int n) 
	{
		if(n < 2)
			return 1;
		return fibonacci(n - 2) + fibonacci(n - 1);
	}
	

}
