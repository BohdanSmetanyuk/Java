package inheritance;

public class Main 
{

	public static void main(String[] args)
	{
		shapeTest();
	}

	
	static void shapeTest()
	{
		Ball ball = new Ball(3.3);
		Cylinder cylinder = new Cylinder(2, 2);
		Pyramid pyramid = new Pyramid(40.12, 40.234);
		
		Box box = new Box(1000.00);
		
		System.out.println(box.add(ball));
		System.out.println(box.add(cylinder));
		System.out.println(box.add(pyramid));
		
	}
}

/* 1.����������� �������� �������, ����������� ��������� ������
 * 
 * ������:
 * ���������� �������� ������� (diagram.png)
 * 
 * ����� Box �������� �����������, �� ����� ��������� � ���� ������ ������. ����� add() ���������
 * �� ���� Shape. ����� ��������� ����� ������ �� ��� ���, ���� ��� ��� ������� ����� � Box (�����
 * ������� ������ �����, ��������� �����. ��������, �� ���������� ��������). ���� ����� ���
 * ���������� ����� ������ �� �������, �� ����� ������ ������� false
 * 
 * �������:
 * Shape.java, shapeTest()
 */