package basics;

import java.util.Arrays;
import java.util.Random;

public class Basics 
{
	public static void main(String[] args)
	{
		findMaxMinAvg();
		//bubbleSort();
		//findPrimeNumbers();
		//removeNumberFromArray();
	}
	
	static void findMaxMinAvg()
	{
		double[] array = new double[new Random().nextInt(1000)+1];  // from 1 to 1000
		
		for(int i=0; i<array.length; i++)
			array[i] = Math.random();
		
		double min = array[0], max = array[0], avg = 0;
		
		for(double num: array)
		{
			if(num>max)
				max = num;
			if(num<min)
				min = num;
			avg += num/array.length;
		}
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Avg: " + avg);
	}
	
	static void bubbleSort()
	{
		Random rand = new Random();
		int[] array = new int[30];
		for(int i=0; i < array.length; i++)
			array[i] = rand.nextInt(100);
		
		System.out.println("Before sort:\n" + Arrays.toString(array));
		
		int temp;
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j< array.length - i - 1; j++)
			{
				if(array[j]>array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;		
				}	
			}	
		}
		
		System.out.println("After sort:\n" + Arrays.toString(array));
	}
	
	static void findPrimeNumbers()
	{
		out:
		for(int i=2; i<=100; i++)
		{	
			in:
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					continue out;
				}
			}
			System.out.print(i + " ");
		}
	}
	
	static void removeNumberFromArray()
	{
		int[] testArray = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5};
		int numberForDelete = 2;
		
		System.out.println("Basic array: " + Arrays.toString(testArray));
		System.out.println("Number for delete: " + numberForDelete);
		
		int counter = 0;
		for(int i=0; i<testArray.length; i++)
		{
			if(testArray[i]==numberForDelete)
				counter++;
			else
				testArray[i-counter] = testArray[i];
		}
		
		int[] newTestArray = Arrays.copyOf(testArray, testArray.length-counter);
		System.out.println("Array after cleaning: " + Arrays.toString(newTestArray));
		
		
	}
}

/* 1. ������������, ����������� � ������� ��������
 * 
 * ������:
 * ��������� ������ ��������� ������� � �������� ������������, ����������� � ������� ��������.
 * ��� ��������� ���������� ����� ����������� ����� Math.random(), 
 * ������� ���������� �������� � ���������� [0, 1].
 * 
 * �������:
 * findMinMaxAvg()
 * 
 * 2. ���������� �������� ���������� ��������� ��� ���������� �������
 * 
 * �������:
 * bubbleSort()
 * 
 * 3. ����� ������� �����
 * 
 * ������:
 * �������� ���������, ������� ������� �� ������� ������� ����� � ���������� �� [2, 100].
 * ����������� ��� ������� ���� ������ �������� "%" (������� �� �������) � �����.
 * 
 * �������:
 * findPrimeNumbers()
 * 
 * 4. �������� �� �������
 * 
 * ������:
 * ��� ������ ����� ����� � ��� ���� ����� �����. ������� ��� ��������� ����� ����� �� �������
 * (��������� ���� �� ������).
 * 
 * �������:
 * removeNumberFromArray()
 * 
 * 
 */

