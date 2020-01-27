package mypack;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music
{
	public String getSong()
	{
		return "Highway to Hell"; 
	}
}
