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

/* 1.Проектирование и создание класса, описывающего вектор
 * 
 * Задача:
 * Создайте класс, который описывает вектор (в трёхмерном пространстве).
 * У него должны быть:
 * конструктор с параметрами в виде списка координат x, y, z
 * метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt()
 * метод, вычисляющий скалярное произведение
 * метод, вычисляющий векторное произведение с другим вектором
 * метод, вычисляющий угол между векторами (или косинус угла)
 * методы для суммы и разности
 * статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 * Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый. То есть,
 * нужно реализовать шаблон "Неизменяемый объект"
 * 
 * Решение:
 * Vector.java, testVector()
 *
 */