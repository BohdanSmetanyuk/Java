package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("musicPlayerBean")
@Scope("singleton")
public class MusicPlayer 
{
	//@Autowired
	//@Qualifier("rockMusicBean")
	private Music music;
	
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;
	
	@Autowired
	public MusicPlayer(@Qualifier("rockMusicBean") Music music)
	{
		this.music = music;
	}
	
	//@Autowired
	public void setMusic(Music music)
	{
		this.music = music;
	}
	
	public void playMusic()
	{
		System.out.println(music.getSong());
	}
	
	public void printInfo()
	{
		System.out.println("Volume: " + volume + "\nName: " + name);
	}
	
	@PostConstruct
	private void postConstruct()
	{
		System.out.println("post-construct");
	}
	
	@PreDestroy
	private void preDestroy()
	{
		System.out.println("pre-destroy");
	}
	
}
