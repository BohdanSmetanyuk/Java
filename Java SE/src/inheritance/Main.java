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

/* 1.Реализовать иерархию классов, описывающую трёхмерную фигуру
 * 
 * Задача:
 * Реализуйте иерархию классов (diagram.png)
 * 
 * Класс Box является контейнером, он можем содержать в себе другие фигуры. Метод add() принимает
 * на вход Shape. Нужно добавлять новые фигуры до тех пор, пока для них хватаем места в Box (будем
 * считать только объём, игнорируя форму. Допустим, мы переливаем жидкость). Если места для
 * добавления новой фигуры не хватает, то метод должен вернуть false
 * 
 * Решение:
 * Shape.java, shapeTest()
 */