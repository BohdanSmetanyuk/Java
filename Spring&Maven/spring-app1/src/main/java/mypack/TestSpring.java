package mypack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring
{
	public static void main(String[] args)
	{
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//TestBean testBean = context.getBean("testBean", TestBean.class);
		
		//System.out.println(testBean.getName());
		
		//testScope();
		
		testInitDestroyFactory();
		
		//context.close();
	}
	
	private static void testScope()
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MusicPlayer mp1 = context.getBean("musicPlayer", MusicPlayer.class);
		MusicPlayer mp2 = context.getBean("musicPlayer", MusicPlayer.class);
		
		System.out.println("Scope Singleton: " + (mp1 == mp2));
		
		Music m1 = context.getBean("musicBean", RockMusic.class);
		Music m2 = context.getBean("musicBean", RockMusic.class);
		
		System.out.println("Scope Prototype: " + (m1 == m2));
		
		context.close();
	}
	
	private static void testInitDestroyFactory()
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		NewTestBean ntb = context.getBean("newTestBean", NewTestBean.class);
		
		context.close();
	}
}
