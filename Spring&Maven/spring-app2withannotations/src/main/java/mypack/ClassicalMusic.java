package mypack;

import org.springframework.stereotype.Component;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music
{
	public String getSong()
	{
		return "Hungarian Rhapsody";		
	}
}
