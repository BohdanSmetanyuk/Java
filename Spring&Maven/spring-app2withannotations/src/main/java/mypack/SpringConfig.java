package mypack;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("mypack")
@PropertySource("classpath:MusicPlayer.properties")
public class SpringConfig 
{
	//@Bean
	//public ClassicalMusic classicalMusicBean()
	//{
		//return new ClassicalMusic();
	//}
	
	//@Bean
	//@Scope("singleton")
	//public MusicPlayer musicPlayerBean()
	//{
		//return new MusicPlayer(classicalMusicBean());
	//}
}
