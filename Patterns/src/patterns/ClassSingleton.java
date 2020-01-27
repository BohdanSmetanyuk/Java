package patterns;

public class ClassSingleton 
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
