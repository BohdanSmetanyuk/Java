package mypack;

public class NewTestBean
{
	// Factory method pattern
	
	private NewTestBean() {}
	
	public static NewTestBean getNewTestBean()
	{
		return new NewTestBean();
	}
	
	private void initMethod()
	{
		System.out.println("Init");
	}
	
	private void destroyMethod()
	{
		System.out.println("Destroy");
	}
	
}
