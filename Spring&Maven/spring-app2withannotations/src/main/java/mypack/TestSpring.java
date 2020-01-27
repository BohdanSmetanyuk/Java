package mypack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args)
	{
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
		MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
		musicPlayer.playMusic();
		musicPlayer.printInfo();
		
		context.close();
	}

}
