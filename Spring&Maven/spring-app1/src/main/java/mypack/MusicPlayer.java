package mypack;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer
{
	//private Music music;
	private String name;
	private int volume;
	
	private List<Music> playList;
	
	// IOC
	//MusicPlayer(Music music)
	//{
		//this.music = music;
	//}
	
	MusicPlayer() 
	{
		playList = new ArrayList<Music>(); //
	}
	
	//public void setMusic(Music music)
	//{
		//this.music = music;
	//}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public void setVolume(int volume)
	{
		this.volume = volume;
	}
	
	//public void playMusic()
	//{
		//System.out.println("Playing: " + music.getSong());
	//}
	
	public void setPlayList(List<Music> playList)
	{
		this.playList = playList;
	}
	
	public void playPlayList()
	{
		for(Music song: playList)
			System.out.println(song.getSong());
	}
}
