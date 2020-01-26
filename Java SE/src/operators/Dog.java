package operators;

class Dog
{
	private String name;
	private String says;
	void setName(String n) 
	{
		name = n;
	}
	void setSays(String s)
	{
		says = s;
	}
	String getName() 
	{
		return name;
	}
	void speak() 
	{
		System.out.println(says);
	}

}
