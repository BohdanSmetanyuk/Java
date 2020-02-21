package patterns;

public class ClassSingleton // better with enum
{
	 private static ClassSingleton instance;


	 // ВАЖНО: Конструктор должен быть приватным
	 // Мы не хотим, чтобы пользователь мог создавать новые объекты класса Lesson7Singleton
	 private ClassSingleton() {}

	 // Вот этот статический метод будет вызывать пользователь, чтобы получить объект класса Lesson7Singleton
	 public static ClassSingleton getInstance()
	 {
		 // если ранее не был создан единственный объект
	     if (instance == null)
	     {
	     // код здесь выполняется только в момент первого вызова метода getInstance()
         // создаем объект один раз
	    	 instance = new ClassSingleton();
	     }

	     // все остальные вызовы метода getInstance() пользователю возвращается тот же самый объект
	     return instance;
	 }    
}
