package oop;

public class Main 
{

	public static void main(String[] args)
	{
		testVector();
	}

	static void testVector()
	{
        Vector[] vectors = Vector.vectorGenerator(5);
        Vector.printVectors(vectors);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println("Length: " + vectors[0].length());
        System.out.printf("Scalar producing between %s and %s: %f\n", vectors[0], vectors[1], vectors[0].scalarProducing(vectors[1]));
        System.out.printf("Vector producing between %s and %s: %s\n", vectors[0], vectors[1], vectors[0].vectorProducing(vectors[1]));
        System.out.printf("Cos between %s and %s: %f\n", vectors[0], vectors[1], vectors[0].cos(vectors[1]));
        System.out.printf("Sum between %s and %s: %s\n", vectors[0], vectors[1], vectors[0].sum(vectors[1]));
        System.out.printf("Difference between %s and %s: %s\n",vectors[0], vectors[1], vectors[0].difference(vectors[1]));
	}
}

/* 1.�������������� � �������� ������, ������������ ������
 * 
 * ������:
 * �������� �����, ������� ��������� ������ (� ��������� ������������).
 * � ���� ������ ����:
 * ����������� � ����������� � ���� ������ ��������� x, y, z
 * �����, ����������� ����� �������. ������ ����� ��������� � ������� Math.sqrt()
 * �����, ����������� ��������� ������������
 * �����, ����������� ��������� ������������ � ������ ��������
 * �����, ����������� ���� ����� ��������� (��� ������� ����)
 * ������ ��� ����� � ��������
 * ����������� �����, ������� ��������� ����� ����� N, � ���������� ������ ��������� �������� �������� N.
 * ���� ����� ���������� ������, �� �� ������ ���������� ����� ������, � �� ������ �������. �� ����,
 * ����� ����������� ������ "������������ ������"
 * 
 * �������:
 * Vector.java, testVector()
 *
 */