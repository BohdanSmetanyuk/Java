package mypack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusicPlayer 
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Music music = context.getBean("classicalMusicBean", ClassicalMusic.class);
		//MusicPlayer musicPlayer = new MusicPlayer(music);
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		//musicPlayer.playMusic();
		musicPlayer.playPlayList();
		
		
		System.out.println(musicPlayer.getName());
		System.out.println(musicPlayer.getVolume());
		
		context.close();
	}
}
