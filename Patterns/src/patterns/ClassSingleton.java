package patterns;

public class ClassSingleton // better with enum
{
	 private static ClassSingleton instance;


	 // �����: ����������� ������ ���� ���������
	 // �� �� �����, ����� ������������ ��� ��������� ����� ������� ������ Lesson7Singleton
	 private ClassSingleton() {}

	 // ��� ���� ����������� ����� ����� �������� ������������, ����� �������� ������ ������ Lesson7Singleton
	 public static ClassSingleton getInstance()
	 {
		 // ���� ����� �� ��� ������ ������������ ������
	     if (instance == null)
	     {
	     // ��� ����� ����������� ������ � ������ ������� ������ ������ getInstance()
         // ������� ������ ���� ���
	    	 instance = new ClassSingleton();
	     }

	     // ��� ��������� ������ ������ getInstance() ������������ ������������ ��� �� ����� ������
	     return instance;
	 }    
}
